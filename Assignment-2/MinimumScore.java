public class MinimumScore {
    public static int minimumScore(int[] nums, int k) {
        int minNum = nums[0];
        int maxNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int minPossible = Math.min(num - k, minNum);
            int maxPossible = Math.max(num + k, maxNum);
            minNum = Math.min(minPossible, num);
            maxNum = Math.max(maxPossible, num);
        }

        return maxNum - minNum;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimumScore(nums, k);
        System.out.println(minScore); // Output: 0
    }
}