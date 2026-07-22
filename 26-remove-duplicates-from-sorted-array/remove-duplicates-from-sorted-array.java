class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i =0;

        for(int j = 0;j<nums.length;j++){
            if( nums[j] != nums[i]){
                if(nums[j]!=nums[i]){
                    i++;
                    nums[i]= nums[j];
                }
            }
        }

        return i + 1;

        // int officer = 0;
        // int res = 1;
        // int cm = 0;
        // int n = nums.length;
        // while(cm<n){

        //     if(nums[cm] == nums[cm-1]){
        //         cm++;
        //         continue;
        //     }else{
        //         nums[officer+1] = nums[cm];
        //         officer++;
        //         cm++;
        //     }
        // }

        // return res;

        
    }
}