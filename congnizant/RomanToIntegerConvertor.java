package congnizant;

class RomanToIntegerConvertor {

//  Symbol       Value
//  I             1
//  V             5
//  X             10
//  L             50
//  C             100
//  D             500
//  M             1000

//  For example, 2 is written as II in Roman numeral, just two ones added together.
//  12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//      I can be placed before V (5) and X (10) to make 4 and 9.
//      X can be placed before L (50) and C (100) to make 40 and 90.
//      C can be placed before D (500) and M (1000) to make 400 and 900.

    public static int romanToInt(String s) {

        int start = 0 , result = 0  ; 
        while(start < s.length()){
            char previousChar = start > 0 ? s.charAt(start-1) : '-' ;

            switch(s.charAt(start)+""){
                case "I" :
                    result+= 1 ;
                    break ;
                case "V" :
                    result += previousChar == 'I' ? 3 : 5;
                    break ;
                case "X" :
                    result += previousChar == 'I' ? 8 : 10;
                    break ;
                case "L" :
                    result += previousChar == 'X' ? 30 : 50;
                    break ;
                case "C" :
                    result += previousChar == 'X' ? 80 : 100;
                    break ;
                case "D" :
                    result += previousChar == 'C' ? 300 : 500;
                    break ;
                case "M" :
                    result += previousChar == 'C' ? 800 : 1000;
                    break ;
                default  : 
                    result+= 0 ;

            }
            start++ ;
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}