package twoPointerpointers;

public class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1;
            int j=n-1;
            int k=m+n-1;
            while(j>=0){
                if(i>=0 && nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                    i--;
                }
                else{
                    nums1[k]=nums2[j];
                    j--;
                }
                k--;
            }
    }

    public static void main(String[] args) {

        int[] n1 = {0} ;
        int[] n2 = {1} ;
        merge(n1, 1, n2,1);
    }
}
