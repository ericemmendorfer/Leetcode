// https://leetcode.com/problems/number-of-1-bits

class Solution {
    public int hammingWeight(int n) {
        int ones = 0;

        while (n != 0) {
            // Check if the least significant bit is 1
            ones += n & 1;
            // Right shift the bits of n by 1
            n = n >>> 1; // Unsigned right shift
        }

        return ones;
    }
}