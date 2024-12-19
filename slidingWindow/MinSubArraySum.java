package slidingWindow;

public class MinSubArraySum {

    public static int minSubArraySum(int[] numArray , int targetSum ) {

        int count = numArray.length ;
        int sum = numArray[0] ;
        for(int i = 0 , j = 0 ; i < numArray.length && j < numArray.length ; ){
            if( sum >= targetSum){
                int tempCount = j - i + 1 ;
                if(tempCount < count){
                    count = tempCount ;
                }
                sum = sum - numArray[i] ;
                i++;
            }else{
                j++ ;
                if(j < numArray.length)
                    sum = sum + numArray[j] ;
            }
        }
        return count == numArray.length ? 0 : count;
    }

    public static void main(String[] args) {
        System.out.println(minSubArraySum(new int[]{1,4,3,2,8,10,6} , 100));
    }
}
