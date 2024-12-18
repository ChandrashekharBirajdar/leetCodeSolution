class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0 , j = nums.length - 1 ;
        int count = 0 ;
        while(i < j  ){
            if(nums[i] == val ){
                if(nums[j] == val ){
                    nums[j] = -1 ; 
                    j-- ;
                    count++ ;
                    continue;
                }else{
                    nums[i] = nums[j] ; 
                    nums[j] = -1 ; 
                    j-- ;
                    count++ ;
                }
            }
            i++ ; 
        }
        for(int num : nums){
            System.out.print(num+" \t");
        }
        return count ;
    }

    public static void main(String[] args) {
        System.out.println("Removed element count "+removeElement(new int[]{1} , 1) );

    }
}