class Solution {    
    public String largeOddNum(String s) {
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) % 2 != 0){
                String ans = s.substring(0, i+1);
                ans = ans.replaceFirst("^0+", "");
                return ans;
            }
        }
        return "";
    }

}