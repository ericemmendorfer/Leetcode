// https://leetcode.com/problems/greatest-common-divisor-of-strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String gcd="";
        int gcdnum = gcd(str1.length(), str2.length());
        int len= Math.max(str1.length(), str2.length());
        String test1 = str1.concat(str2);
        String test2= str2.concat(str1);
        if (!(test1.equals(test2))){
            return "";
        }
        for (int i =0; i<len; i++){
            if(str1.length()>i & str2.length()>i){
                if (str1.charAt(i)==str2.charAt(i)){
                    gcd+=str1.charAt(i);
                }else{
                    return gcd;
                }
            }
        }
        return gcd.substring(0,gcdnum);
    }
     private int gcd(int a, int b) {
        // Base case: if b is 0, then a is the GCD (as GCD(a, 0) = a)
        // Recursive step: GCD(a, b) = GCD(b, a mod b)
        return b == 0 ? a : gcd(b, a % b);
}
}