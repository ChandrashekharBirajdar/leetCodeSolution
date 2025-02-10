package leetCodeDaily;

public class CommonDivisorString {

    public static String gcdOfStrings(String str1, String str2) {

        String result = "";
        for (int i = 0; i < str2.length(); i++) {
            if (str1.contains(str2.substring(0, i))) {
                result = str2.substring(0, i+1);
            }
        }



        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
