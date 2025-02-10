package leetCodeDaily;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {

    public static String getReversedWords(String statement){

        StringBuffer result = new StringBuffer();

        List<String> wordsList = Arrays.stream(statement.split(" "))
                .filter(word -> !word.isBlank())
                .toList() ;

        for (int i = wordsList.size() - 1 ; i >= 0 ; i--) {
            result.append(wordsList.get(i)+" ") ;
        }
        return  result.toString().trim() ;
    }

    public static void main(String[] args) {
        System.out.println(getReversedWords("a good   example"));
    }
}
