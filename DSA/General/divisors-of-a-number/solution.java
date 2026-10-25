class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0) ans.add(i);
        }
        Collections.sort(ans);
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}