class MaximumSubarraySum {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++){
            if(sum >=0){
                sum = sum + nums[i];
            }
            else{
                sum = nums[i];
            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        MaximumSubarraySum sol = new MaximumSubarraySum();
        
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test 1: " + sol.maxSubArray(nums1)); // Expected: 6
        
        // Test case 2
        int[] nums2 = {5};
        System.out.println("Test 2: " + sol.maxSubArray(nums2)); // Expected: 5
        
        // Test case 3
        int[] nums3 = {-1};
        System.out.println("Test 3: " + sol.maxSubArray(nums3)); // Expected: -1
    }
}