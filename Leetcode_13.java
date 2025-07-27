class Leetcode_13 {
    public void sortColors(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    // Fix: Proper array-based swap
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Fix: Use arr.length and correct variable
    public static void print_Arr(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
        System.out.println();
    }
}