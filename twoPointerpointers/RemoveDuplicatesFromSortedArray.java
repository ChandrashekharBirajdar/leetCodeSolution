package twoPointerpointers;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){

        int removedDuplicateCount = 0 ;
        int length = nums.length - 1 ;
        List<Number> skippedDuplicates = new ArrayList<>();
        int updatedIndex = 1 ;
        for(int startPointer = 0  ; startPointer < length ; ){
            if(skippedDuplicates.contains(nums[startPointer])){
                startPointer++;
                continue;
            }else{
                int endPointer = length ;
                while( endPointer > startPointer && nums[startPointer] != nums[endPointer] ){
                    endPointer -- ;
                }
                if(endPointer < length) {
                    nums[updatedIndex] = nums[endPointer + 1];
                    updatedIndex++;
                    skippedDuplicates.add(nums[startPointer]);
                }
                startPointer = endPointer  ;
            }
        }

        for(int i = 0 ; i < updatedIndex ; i++){
            System.out.println(nums[i]);
        }

        return length - removedDuplicateCount ;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
