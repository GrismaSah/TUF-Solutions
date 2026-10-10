class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0, secondmax =0;
        int maxkey = -1, secondmaxkey = -1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int key = e.getKey();
            int freq = e.getValue();

            if(freq > max){
                secondmax = max;
                secondmaxkey = maxkey;
                max = freq;
                maxkey = key;
            }
            else if(freq == max){
                max = freq;
                maxkey = Math.min(key, maxkey);
            }
            else if(freq > secondmax && freq < max){
                secondmax = freq;
                secondmaxkey = key;
            }
            else if(secondmax == freq){
                secondmaxkey = Math.min(secondmaxkey, key);
            }
        }
        return secondmaxkey;
    }
}

