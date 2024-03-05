import java.util.HashMap;
import java.util.Map;

public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        // Create a map to store punctuation marks and their counts
        Map<Character, Integer> punctuationCounts = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : text.toCharArray()) {
            // Check if the character is a punctuation mark
            if (isPunctuation(ch)) {
                // Increment the count of the punctuation mark in the map
                punctuationCounts.put(ch, punctuationCounts.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the table header
        System.out.println("--------------------------");
        System.out.println("Punctuation Mark     Count");
        System.out.println("--------------------------");

        // Print the counts of each punctuation mark
        for (Map.Entry<Character, Integer> entry : punctuationCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t|\t\t" + entry.getValue());
        }
        System.out.println("--------------------------");

        
    }

    // Method to check if a character is a punctuation mark
    private static boolean isPunctuation(char ch) {
        return !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch);
    }
}
