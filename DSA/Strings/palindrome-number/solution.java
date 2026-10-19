class Solution {
    public boolean isPalindrome(int n) {
        int original = n;
        if(n < 10) return true;
        int revnum = 0;
        while(n > 0){
            int digit = n%10; 
            revnum = revnum * 10 + digit;
            n = n/10;
        }
        if(revnum == original) return true;
        return false;
    }
}