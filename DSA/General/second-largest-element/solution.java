class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest){
                slargest = largest; 
                largest = nums[i];
            }
            else if(nums[i] > slargest && nums[i] != largest){
                slargest = nums[i];
            }
        }
        if(slargest == Integer.MIN_VALUE){
            slargest = -1;
        }
        return slargest;
    }
}