// https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    public int largestAltitude(int[] gain) {

        int max=0;
        int curr=0;

        if (gain.length==0){
            return 0;
        }

        for (int i=0; i<gain.length; i++){
            curr+=gain[i];
            if (curr>max){
                max=curr;
            }

        }
        return max;
        
    }
}