// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {

        String num=Integer.toString(x);
        for(int i=0; i<num.length()/2; i++){
            if (num.charAt(i)!=num.charAt(num.length()-1-i))
            return false;
        }
        return true;
        
    }
}