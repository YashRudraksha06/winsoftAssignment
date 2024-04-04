import java.util.HashMap;
import java.util.Map;

public class duplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, world";
        Map<Character, Integer> charCountMap = new HashMap<>();
        str = str.toLowerCase();
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char ch = characters[i];
            Integer count = charCountMap.get(ch);
            if (count == null) {
                charCountMap.put(ch, 1);
            } else {
                charCountMap.put(ch, count + 1);
            }
        }
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}