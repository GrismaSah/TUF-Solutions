class Solution {    
    public String longestCommonPrefix(String[] str) {
        String first = str[0];
        String ans = "";
        for(int i=0; i<first.length(); i++){
            for(int j=1; j<str.length; j++){
                if(i>=str[j].length() || first.charAt(i) != str[j].charAt(i)){
                    return ans;
                }
            }
            ans += first.charAt(i);

        }
        return ans;
    }
}