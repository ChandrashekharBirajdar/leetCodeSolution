package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringTwoDistinctElement {


    public static void main(String[] args) {
        System.out.println(getLongestSubstringWithAtmostTwoDistinctElement("1212121215555555558974123"));;
    }

    private static String getLongestSubstringWithAtmostTwoDistinctElement(String inputString) {
        char[] inputCharArray = inputString.toCharArray();
        String result = "";
        int i = 0   ;
        while(i < inputString.length()){
            int j = i ;
            Set<Character> uniqueCharacter = new HashSet<>();
            uniqueCharacter.add(inputCharArray[i]) ;

            while( j < inputString.length() && uniqueCharacter.size() <= 2 ) {
                if (uniqueCharacter.contains(inputCharArray[j])) {
                    j++;
                } else {
                    uniqueCharacter.add(inputCharArray[j]);
                }
            }
            result = inputString.substring(i,j).length() > result.length() ? inputString.substring(i,j) : result ;
            i++ ;
        }
        return result ;
    }
}
