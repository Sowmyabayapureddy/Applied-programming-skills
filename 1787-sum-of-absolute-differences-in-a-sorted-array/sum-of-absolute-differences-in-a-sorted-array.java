class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] res = new int[nums.length];
        int prefixSum = 0;
        int suffixSum = 0;

        for (int num : nums) {
            suffixSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = nums[i] * i - prefixSum;
            int rightSum = suffixSum - nums[i] * (nums.length - i);
            int totalSum = leftSum + rightSum;

            res[i] = totalSum;

            prefixSum += nums[i];
            suffixSum -= nums[i];
        }

        return res;        
    }
}