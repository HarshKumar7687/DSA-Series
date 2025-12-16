class sort {
    public static int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 4, 1 };
        int[] sorted = sortArray(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}