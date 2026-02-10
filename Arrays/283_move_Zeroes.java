class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums1);
        System.out.print("Test 1: ");
        for (int num : nums1) System.out.print(num + " ");
        System.out.println();
        
        // Test case 2
        int[] nums2 = {0};
        sol.moveZeroes(nums2);
        System.out.print("Test 2: ");
        for (int num : nums2) System.out.print(num + " ");
        System.out.println();
    }
}