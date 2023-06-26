import java.util.Arrays;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Return the maximum of two cases:
        // 1. Product of the three largest numbers
        // 2. Product of the two smallest numbers and the largest number
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }

    public static void main(String[] args) {
        MaximumProduct solution = new MaximumProduct();
        
        // Example usage
        int[] nums = {1, 2, 3};
        int maxProduct = solution.maximumProduct(nums);
        
        System.out.println("Maximum product: " + maxProduct);
    }
}