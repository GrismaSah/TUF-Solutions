class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        for(Integer value : map.values()){
            if(value > highestFreq){
                highestFreq = value;
            }
            if(value < lowestFreq){
                lowestFreq = value;
            }
        }
        int sum = lowestFreq + highestFreq;
        return sum;
    }
}
