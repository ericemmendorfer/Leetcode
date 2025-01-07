// https://leetcode.com/problems/power-of-two

class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n==1){
           return true;
       }
        if (n%2!=0){
            return false;
        }
        else{
            n=n/2;
        }
        
        int i=1;
        while (i<=n){
            if (i==n)
                 return true;

                i=i*2;
        }
            
        
        return false;
        
    }
}