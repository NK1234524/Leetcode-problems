class Leetcode_9 {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;  // reset for each number

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];  // found the unique number
            }
        }

        return -1; // fallback if no unique number is found
    }
}
