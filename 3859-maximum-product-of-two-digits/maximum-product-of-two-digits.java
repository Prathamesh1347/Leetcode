class Solution {
    public int maxProduct(int n) {

        int max1 = 0;
        int max2 = 0;
        int temp = n ;

        while(temp!=0){
            int ldigit = temp %  10;
            if(ldigit > max1){
                max2 = max1;
                max1 = ldigit;

            }
            else if(ldigit > max2 ){
                max2 = ldigit;
            }


            temp = temp / 10;

        }
        return max1 *max2;
        
    }
}