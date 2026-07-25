class Solution {
    public int maxProduct(int n) {

        int max1 = 0;
        int max2 = 0;
        

        while(n!=0){
            int ldigit = n %  10;
            if(ldigit > max1){
                max2 = max1;
                max1 = ldigit;

            }
            else if(ldigit > max2 ){
                max2 = ldigit;
            }


            n = n / 10;

        }
        return max1 *max2;
        
    }
}