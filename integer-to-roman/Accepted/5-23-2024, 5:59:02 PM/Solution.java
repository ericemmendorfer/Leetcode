// https://leetcode.com/problems/integer-to-roman

class Solution {
    public String intToRoman(int num) {

       String roman= "";

        int ms= num/1000;
        num=num%1000;
        int cms = num/900;
        num=num%900;
        int ds = num/500;
        num=num%500;
        int cds = num/400;
        num=num%400;
        int cs = num/100;
        num=num%100;
        int xcs = num/90;
        num=num%90;
        int ls = num/50;
        num=num%50;
        int xls = num/40;
        num=num%40;
        int xs = num/10;
        num=num%10;
        int ixs = num/9;
        num=num%9;
        int vs = num/5;
        num=num%5;
        int ivs = num/4;
        num=num%4;
        int is = num;
        

        for (int i=0; i<ms;i++){
        roman+='M'; 
        }

        for (int i=0; i<cms;i++){
        roman+="CM"; 
        }

        for (int i=0; i<ds;i++){
        roman+='D'; 
        }
        for (int i=0; i<cds;i++){
        roman+="CD"; 
        }

        for (int i=0; i<cs;i++){
        roman+='C'; 
        }

        for (int i=0; i<xcs;i++){
        roman+="XC"; 
        }

        for (int i=0; i<ls;i++){
        roman+='L'; 
        }

        for (int i=0; i<xls;i++){
        roman+="XL"; 
        }
        for (int i=0; i<xs;i++){
        roman+='X'; 
        }
        for (int i=0; i<ixs;i++){
        roman+="IX"; 
        }
        for (int i=0; i<vs;i++){
        roman+='V'; 
        }

        for (int i=0; i<ivs;i++){
        roman+="IV"; 
        }
        for (int i=0; i<is;i++){
        roman+='I'; 
        }


        return roman;
    }
}