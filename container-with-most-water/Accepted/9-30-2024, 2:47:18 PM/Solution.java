// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        int front = 0;
        int back = height.length-1;
        int best = 0;
        

        if (height.length ==0){
            return 0;
        }


        //take pointers on both ends, shorter one moves in 1 if same height move in on right
        //multiply smaller height by distance if beats best replace

        for (int i=0; i<height.length; i++){
            int current;
            int distance = back-front;
            
            if(height[front] > height[back]){
                current = height[back] * distance;
                back--;
            }
            else{
                current = height[front] * distance;
                front++;
            }

            if (current > best){
                    best = current;
                }
        }

        return best;
    }
}