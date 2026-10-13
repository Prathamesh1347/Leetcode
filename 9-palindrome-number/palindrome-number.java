class Solution {
    public boolean isPalindrome(int x) {

        int temp = x;
        int result = 0;

        while(temp!=0){
           int  ldigit = temp%10;
            result = result * 10 + ldigit;
            temp /=10; 
        }
        if(x<0){
            return false;
        }
        else if(result == x){
            return true;
        }else{
            return false;
        }
    }
}