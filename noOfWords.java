import java.util.HashMap;

public class noOfWords {
    public static void main(String[] args) {
        String inputString = "For example";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            Integer count = wordCountMap.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            wordCountMap.put(word, count);
        }
        int totalWords = words.length;
        System.out.println("Total number of words: " + totalWords);
    }
}