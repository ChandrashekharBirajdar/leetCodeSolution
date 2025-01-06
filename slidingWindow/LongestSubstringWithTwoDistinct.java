package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithTwoDistinct {
    public static String findLongestSubstringWithTwoDistinct(String inputString) {
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0, maxLength = 0, start = 0;
        
        // Traverse through the string with the right pointer
        for (int right = 0; right < inputString.length(); right++) {
            char currentChar = inputString.charAt(right);
            // Add the current character to the map with its frequency
            charMap.put(currentChar, charMap.getOrDefault(currentChar, 0) + 1);
            
            // If there are more than 2 distinct characters, shrink the window from the left
            while (charMap.size() > 2) {
                char leftChar = inputString.charAt(left);
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                left++;
            }
            
            // Update the result if a longer valid substring is found
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
        
        // Return the longest substring
        return inputString.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String inputString = "1212121215555555558974123";
        System.out.println(findLongestSubstringWithTwoDistinct(inputString)); // Output: "ece"
    }
}
