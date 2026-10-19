class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int cL = 0;
        int cTarget = 0;

        for(int num : nums){
            if(num<target){
                cL++;

            }else if (num == target){
                cTarget++;

            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < cTarget; i ++){
            result.add(cL + i);
        }

        return result;
        
    }
}