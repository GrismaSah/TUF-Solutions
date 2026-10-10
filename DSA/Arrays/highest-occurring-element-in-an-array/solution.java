class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        int max = 0;
        int result = -1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int freq = e.getValue();
            int key = e.getKey();
            if(freq > max || (freq == max && key < result)){
                max = freq;
                result = key;
            }
        }
        return result;
    }
}


