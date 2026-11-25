class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;    
        int[] result = new int[n];
        int right = n-1;
        int left = 0;

        for(int i = n-1; i>= 0; i--){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(rightSquare > leftSquare){
                result[i] = rightSquare;
                right--;
            }else{
                result[i] = leftSquare;
                left++;
            }
        }
        return result;

    }
}