class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        int max = Integer.MIN_VALUE;
        for(int freq : map.values()){
            if(freq >= max ){
                max = freq;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int freq : map.values()){
            if(freq <= min){
                min = freq;
            }
        }
        int result = max + min;
        return result;
    }
}
