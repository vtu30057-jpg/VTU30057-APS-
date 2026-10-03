class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 0;
        int total = 0;

        for (int x : nums)
            total += x;

        for (int i = 0; i < n; i++) {
            int left = nums[i] * i - prefix;
            int right = (total - prefix - nums[i]) - nums[i] * (n - i - 1);

            result[i] = left + right;
            prefix += nums[i];
        }

        return result;
    }
}