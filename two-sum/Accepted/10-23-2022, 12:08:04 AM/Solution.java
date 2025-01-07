// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]key=new int[2];
for (int i=0; i<nums.length;i++){
    for (int j=1; j<nums.length;j++){
        if (i==j){
            j++;
        }
        if (nums[i]+nums[j]==target){
            key[0]=i;
            key[1]=j;
            
            return key;
            
        }
    }
}
                    return key;


    }
}