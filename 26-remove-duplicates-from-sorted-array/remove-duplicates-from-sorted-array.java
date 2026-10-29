class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int n = nums.length;
        if ( n == 0) return 0;

        int off = 0;

        for(int cm =1; cm<n;cm++){
            if(nums[cm] != nums[off]){
                off++;
                nums[off]=nums[cm];
            }
        }

        return off+1;
    }
}