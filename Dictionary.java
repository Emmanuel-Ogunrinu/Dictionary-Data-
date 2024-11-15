import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    private Map<String, List<DictionaryData>> dictionaryMap;

    public Dictionary() {
        dictionaryMap = new HashMap<>();
        loadDictionaryData();
    }

    private void loadDictionaryData() {
        for (DictionaryData data : DictionaryData.values()) {
            String key = data.name().split("_")[0].toLowerCase();
            dictionaryMap.computeIfAbsent(key, k -> new ArrayList<>()).add(data);
        }
        System.out.println("! Loading data...");
        System.out.println("! Loading completed...");
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords: " + dictionaryMap.keySet().size());
        System.out.println("----- Definitions: " + Arrays.stream(DictionaryData.values()).count());
    }

    public List<String> search(String keyword, String partOfSpeech, boolean distinct, boolean reverse) {
        List<DictionaryData> entries = dictionaryMap.get(keyword.toLowerCase());

        if (entries == null) {
            return Collections.emptyList();
        }

        if (partOfSpeech != null) {
            entries = entries.stream()
                    .filter(entry -> entry.getPartOfSpeech().equalsIgnoreCase(partOfSpeech))
                    .collect(Collectors.toList());
        }

        List<String> results = entries.stream()
                .map(entry -> keyword + " [" + entry.getPartOfSpeech() + "] : " + entry.getDefinition())
                .collect(Collectors.toList());

        if (distinct) {
            results = results.stream().distinct().collect(Collectors.toList());
        }

        if (reverse) {
            Collections.reverse(results);
        }

        return results;
    }

    public static Set<String> getValidPartsOfSpeech() {
        return Arrays.stream(DictionaryData.values())
                .map(DictionaryData::getPartOfSpeech)
                .collect(Collectors.toSet());
    }

    public static Set<String> getValidParameters() {
        return Set.of("distinct", "reverse");
    }
}