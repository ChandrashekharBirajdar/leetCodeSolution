package leetCodeDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductInArrayExpectItself {

    public static int[] productExceptSelf(int[] nums) {

        int[] productExpectItself = new int[nums.length] ;

        for (int i = 0 ; i < nums.length ; i++){
            AtomicInteger index = new AtomicInteger(i) ;
            AtomicInteger product = new AtomicInteger(1);
            Arrays.stream(nums)
                    .filter(num -> num != nums[index.get()])
                    .forEach(num -> product.set(num * product.get()));
            productExpectItself[i] = product.get();
        }

        return productExpectItself;
    }

    public static void main(String[] args) {
        int[] nums = {2,2} ;
        Arrays.stream(productExceptSelf(nums))
               .forEach(System.out::println);
    }
}
