// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {

        int j= digits.length-1;

        if(digits[j]!=9){
            digits[j]=digits[j]+1;
        }else{
            while( digits[j]==9){
                digits[j]=0;
                if(j!=0){
                    j--;
                }else{
                     int[] newArray= new int[digits.length+1];
                    newArray[0]=1;
                    for (int x=0; x<digits.length;x++){
                        newArray[x+1]=digits[x];
                    }
                    return newArray;
                    }
            }
                digits[j]=digits[j]+1;
        

        }

        return digits;
        
    }
}