package opus;

import java.util.Arrays;

public class SumInArray {

    private static void sumInArray(int[] numbers) {

        int start = 0;
        int count = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == 25) {
                count++;
                System.out.println("Pairs :" + numbers[start] + " " + numbers[end] + " count is " + count);
                start++;
                end--;
            } else if (numbers[start] + numbers[end] > 25) {
                end--;
            } else {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 5};
        Arrays.sort(numbers);
        sumInArray(numbers);
    }

}