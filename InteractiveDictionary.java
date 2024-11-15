
/****************************************************************
 *
 * File: [Assignment 02]
 * By: [Emmanuel Ogunrinu]
 * Date: [06-21-2024]
 *
 * Description: [We are hired to implement an interactive dictionary. Our dictionary takes input from users and uses the input as a search
 * key to look up values associated with the key]
 *
 ****************************************************************/

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InteractiveDictionary {
    private static final Set<String> VALID_PARTS_OF_SPEECH = Dictionary.getValidPartsOfSpeech();
    private static final Set<String> VALID_PARAMETERS = Dictionary.getValidParameters();

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        int searchCount = 1;

        while (true) {
            System.out.print("Search [" + searchCount + "]: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("!q")) {
                System.out.println("-----THANK YOU-----");
                break;
            }

            if (input.equalsIgnoreCase("!help") || input.isBlank()) {
                displayHelp();
                searchCount++;
                continue;
            }

            String[] parts = input.split("\\s+");
            String keyword = parts[0];
            String partOfSpeech = null;
            boolean distinct = false;
            boolean reverse = false;

            boolean invalidParameter = false;
            StringBuilder invalidMessages = new StringBuilder();

            for (int i = 1; i < parts.length && i <= 4; i++) {
                if (parts[i].equalsIgnoreCase("distinct")) {
                    distinct = true;
                } else if (parts[i].equalsIgnoreCase("reverse")) {
                    reverse = true;
                } else if (partOfSpeech == null && VALID_PARTS_OF_SPEECH.contains(parts[i].toLowerCase())) {
                    partOfSpeech = parts[i].toLowerCase();
                } else {
                    invalidMessages.append(String.format("|%n"));
                    invalidMessages.append(String.format("<The entered %d%s parameter '%s' is NOT a part of speech.>%n", i + 1, getOrdinalSuffix(i + 1), parts[i]));
                    invalidMessages.append(String.format("<The entered %d%s parameter '%s' is NOT 'distinct'.>%n", i + 1, getOrdinalSuffix(i + 1), parts[i]));
                    invalidMessages.append(String.format("<The entered %d%s parameter '%s' is NOT 'reverse'.>%n", i + 1, getOrdinalSuffix(i + 1), parts[i]));
                    invalidMessages.append(String.format("<The entered %d%s parameter '%s' was disregarded.>%n", i + 1, getOrdinalSuffix(i + 1), parts[i]));
                    invalidMessages.append(String.format("<The %d%s parameter should be a part of speech or 'distinct' or 'reverse'.>%n", i + 1, getOrdinalSuffix(i + 1)));
                    invalidMessages.append(String.format("|%n"));
                    invalidParameter = true;
                }
            }

            if (invalidParameter) {
                // Display invalid parameter messages
                System.out.print(invalidMessages.toString());
            }

            // Display valid search results for the given keyword
            List<String> results = dictionary.search(keyword, partOfSpeech, distinct, reverse);
            if (results.isEmpty()) {
                System.out.println("|");
                System.out.println("<NOT FOUND> To be considered for the next release. Thank you.");
                System.out.println("|");
                displayHelp();
            } else {
                for (String result : results) {
                    System.out.println(result);
                }
                System.out.println("|");
            }

            searchCount++;
        }

        scanner.close();
    }

    private static void displayHelp() {
        System.out.println("|");
        System.out.println("  PARAMETER HOW-TO, please enter:");
        System.out.println("  1. A search key -then 2. An optional part of speech -then");
        System.out.println("  3. An optional 'distinct' -then 4. An optional 'reverse'");
        System.out.println("|");
    }

    private static String getOrdinalSuffix(int number) {
        if (number % 100 >= 11 && number % 100 <= 13) {
            return "th";
        }
        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}