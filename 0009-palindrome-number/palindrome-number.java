class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int orignal = x; int rev = 0;
        while(x>0){
            int last = x%10;
            x = x/10;
            rev = rev*10+last;
        }
        return orignal == rev;
    }
}