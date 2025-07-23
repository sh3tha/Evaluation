public class task2{

    public static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        String sentence = " Learning Java improves your skills and knowledge";

        System.out.println("Original sentence: " + sentence);

        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);

        String replaced = replaceWord(sentence, "JAVA", "Python");
        System.out.println("After replacement: " + replaced);
    }
}
