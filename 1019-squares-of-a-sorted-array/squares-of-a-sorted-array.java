// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         //1. firstly, create new array and add pos and neg values inside that
//         Vector<Integer> pos = new Vector<>();
//         Vector<Integer> neg = new Vector<>();
//         if(nums.size == 0){
//             return nums;
//         }
//         for(int i = 0; i<nums.length; i++){

//             if(nums[i] < 0){
//                 neg.add(nums[i]);
//             }else{
//                 pos.add(nums[i]);
//             }

//             if(neg.size == 0){
//                 for(int i = 0; i<nums.length; i++){
//                     nums[i]=nums[i] * nums[i];
//                     }
//                     return nums;
//             }
    
//             if(pos.size == 0){
//                 collections.reverse(nums);
//                 for(int i = 0; i<nums.length; i++){
//                     nums[i]=nums[i] * nums[i];
//             }
//                     return nums;
//         }
        
//         // what if both values are present
//         for(int i = 0; i<nums.length; i++){
//                 nums[i]=nums[i] * nums[i];
//                     }   
//         }
//         for(int i = 0; i<nums.length; i++){
//             Collections.reverse(nums);
//                     nums[i]=nums[i] * nums[i];
//             }
                   
//                    int result[] = new int[neg + pos];
//                    return result;
//     }
// }
import java.util.Vector;
class Solution {
    public int[] sortedSquares(int[] nums) {
        Vector<Integer> pos = new Vector<>();
        Vector<Integer> neg = new Vector<>();

        // Fix 1: Use .length for arrays
        if (nums.length == 0) {
            return nums;
        }

        // Step 1: Put squared numbers into 'neg' and 'pos'
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i] * nums[i]); // Square it right here!
            } else {
                pos.add(nums[i] * nums[i]); // Square it right here!
            }
        } // Fix 2: Close the first loop BEFORE checking sizes!

        // Case 1: No negative numbers (Fix 3: use .size() with brackets)
        if (neg.size() == 0) {
            for (int i = 0; i < pos.size(); i++) {
                nums[i] = pos.get(i);
            }
            return nums;
        }

        // Case 2: No positive numbers
        if (pos.size() == 0) {
            // Fix 4: Capital 'C', semicolon ';', and reverse 'neg' (not 'nums')
            Collections.reverse(neg);
            for (int i = 0; i < neg.size(); i++) {
                nums[i] = neg.get(i);
            }
            return nums;
        }

        // Case 3: Both negative and positive numbers are present
        Collections.reverse(neg); // Make 'neg' go from smallest to largest

        // Fix 5: Use .size() to get the length of the new array
        int[] result = new int[neg.size() + pos.size()];

        // Merge 'neg' and 'pos' into 'result'
        int i = 0; // pointer for neg
        int j = 0; // pointer for pos
        int k = 0; // pointer for result

        while (i < neg.size() && j < pos.size()) {
            if (neg.get(i) <= pos.get(j)) {
                result[k] = neg.get(i);
                i++;
            } else {
                result[k] = pos.get(j);
                j++;
            }
            k++;
        }

        // Copy leftover elements
        while (i < neg.size()) {
            result[k] = neg.get(i);
            i++;
            k++;
        }
        while (j < pos.size()) {
            result[k] = pos.get(j);
            j++;
            k++;
        }

        return result;
    }
}