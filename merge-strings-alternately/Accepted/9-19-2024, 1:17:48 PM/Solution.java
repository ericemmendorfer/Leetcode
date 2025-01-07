// https://leetcode.com/problems/merge-strings-alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len = word1.length();
        if (word2.length()> len){
            len = word2.length();
        }

        String wordMerge= "";

        for(int i=0; i<len; i++){
            if (word1.length()>i){
                wordMerge +=word1.charAt(i);
            }
            if(word2.length()>i){
                wordMerge +=word2.charAt(i);
            }
        }
        return wordMerge;
        
    }
}