class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int maxFreq = 0;
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();
            
            if(freq > maxFreq){
                maxFreq = freq;
                result = key;
            }
            else if(freq == maxFreq){
                if(key < result){
                    result = key;
                }
            }
            
        }
        return result;
    }
}


