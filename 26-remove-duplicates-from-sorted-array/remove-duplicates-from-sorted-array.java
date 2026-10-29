class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int off = 0;
        int cm = 1;
        int n = nums.length;
        if ( n == 0) return 0;

        while(cm < n){
            if(nums[cm]!=nums[off]){
                nums[off+1] = nums[cm];
                off++;
                k++;
            }
            cm++;
        }
        return k;
    }
}