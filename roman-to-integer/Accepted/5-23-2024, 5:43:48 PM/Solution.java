// https://leetcode.com/problems/roman-to-integer

class Solution {

    public int getVal(char c){
            if(c== 'I'){
                return 1;
            }else if (c== 'V'){
                return 5;
            }else if (c== 'X'){
                return 10;
            }else if (c== 'L'){
                return 50;
            }else if (c== 'C'){
                return 100;
            }else if (c== 'D'){
                return 500;
            }else if (c== 'M')
                return 1000;
            else
                return 0;

        }


    public int romanToInt(String s) {
        int sum = 0;
        int smallSum=0;

        


        for(int i =0; i<s.length(); i++){
            smallSum +=getVal(s.charAt(i));

            if(i<s.length()-1){
                if(getVal(s.charAt(i))< getVal(s.charAt(i+1))){
                    sum+= getVal(s.charAt(i+1)) - smallSum;
                    smallSum= 0;
                    i++;
        
                }else if (getVal(s.charAt(i))> getVal(s.charAt(i+1))){
                    sum += smallSum;
                    smallSum =0;
                }

            
            }


        }
        sum+=smallSum;
        return sum;
        
    }
}