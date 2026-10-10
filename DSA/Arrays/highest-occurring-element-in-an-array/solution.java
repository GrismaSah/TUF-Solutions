class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        int max = 0;
        int maxkey = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int key = e.getKey();
            int freq = e.getValue();

            if(freq > max){
                max = freq;
                maxkey = key;
            }
            if(freq == max ){
                maxkey = Math.min(maxkey, key);
            }
        }
        return maxkey;
    }
}


