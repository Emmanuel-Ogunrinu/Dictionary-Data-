enum DictionaryData {
    ARROW("noun", "Here is one arrow: <IMG> -=>> </IMG>"),
    BOOK_NOUN_1("noun", "A set of pages."),
    BOOK_NOUN_2("noun", "A written work published in printed or electronic form."),
    BOOK_VERB_1("verb", "To arrange for someone to have a seat on a plane."),
    BOOK_VERB_2("verb", "To arrange something on a particular date."),
    DISTINCT_ADJ_1("adjective", "Familiar. Worked in Java."),
    DISTINCT_ADJ_2("adjective", "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT_ADV("adverb", "Uniquely. Written 'distinctly'."),
    DISTINCT_NOUN_1("noun", "A keyword in this assignment."),
    DISTINCT_NOUN_2("noun", "A keyword in this assignment."),
    DISTINCT_NOUN_3("noun", "A keyword in this assignment."),
    DISTINCT_NOUN_4("noun", "An advanced search option."),
    DISTINCT_NOUN_5("noun", "Distinct is a parameter in this assignment"),
    PLACEHOLDER_ADJ_1("adjective", "To be updated..."),
    PLACEHOLDER_ADJ_2("adjective", "To be updated..."),
    PLACEHOLDER_ADV("adverb", "To be updated..."),
    PLACEHOLDER_CONJ("conjunction", "To be updated..."),
    PLACEHOLDER_INT("interjection", "To be updated..."),
    PLACEHOLDER_NOUN_1("noun", "To be updated..."),
    PLACEHOLDER_NOUN_2("noun", "To be updated..."),
    PLACEHOLDER_NOUN_3("noun", "To be updated..."),
    PLACEHOLDER_PREP("preposition", "To be updated..."),
    PLACEHOLDER_PRO("pronoun", "To be updated..."),
    PLACEHOLDER_VERB("verb", "To be updated..."),
    REVERSE_ADJ_1("adjective", "On back side."),
    REVERSE_ADJ_2("adjective", "Opposite to usual or previous arrangement."),
    REVERSE_NOUN_1("noun", "A dictionary program's parameter."),
    REVERSE_NOUN_2("noun", "Change to opposite direction."),
    REVERSE_NOUN_3("noun", "The opposite."),
    REVERSE_NOUN_4("noun", "To be updated..."),
    REVERSE_NOUN_5("noun", "To be updated..."),
    REVERSE_NOUN_6("noun", "To be updated..."),
    REVERSE_NOUN_7("noun", "To be updated..."),
    REVERSE_VERB_1("verb", "Change something to opposite."),
    REVERSE_VERB_2("verb", "Go back"),
    REVERSE_VERB_3("verb", "Revoke ruling."),
    REVERSE_VERB_4("verb", "To be updated..."),
    REVERSE_VERB_5("verb", "To be updated..."),
    REVERSE_VERB_6("verb", "Turn something inside out."),
    // Additional data to make 19 keywords and 61 definitions
    HELLO("interjection", "A greeting."),
    FAST_ADJ("adjective", "Moving or capable of moving at high speed."),
    FAST_ADV("adverb", "At high speed."),
    CODE("noun", "A system of words, letters, figures, or symbols used to represent others."),
    CODE_VERB("verb", "To write code."),
    TREE("noun", "A woody perennial plant."),
    TREE_VERB("verb", "To chase someone up a tree."),
    RIGHT_NOUN("noun", "A moral or legal entitlement to have or do something."),
    RIGHT_ADJ("adjective", "Morally good, justified, or acceptable."),
    NETWORK("noun", "A group or system of interconnected people or things."),
    NETWORK_VERB("verb", "To interact with others to exchange information."),
    COMPUTER("noun", "An electronic device for storing and processing data."),
    SCIENCE("noun", "The intellectual and practical activity encompassing the systematic study of the structure and behavior of the physical and natural world through observation and experiment."),
    TECHNOLOGY("noun", "The application of scientific knowledge for practical purposes."),
    ENGINEERING("noun", "The branch of science and technology concerned with the design, building, and use of engines, machines, and structures."),
    LIGHT_NOUN("noun", "The natural agent that stimulates sight and makes things visible."),
    LIGHT_ADJ("adjective", "Having little weight; not heavy."),
    LIGHT_VERB("verb", "To ignite something."),
    SET_NOUN("noun", "A collection of objects."),
    SET_VERB("verb", "To put something in a specified place."),
    EDUCATION("noun", "The process of receiving or giving systematic instruction."),
    KNOWLEDGE("noun", "Facts, information, and skills acquired through experience or education.");


    private final String partOfSpeech;
    private final String definition;

    DictionaryData(String partOfSpeech, String definition) {
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }
}