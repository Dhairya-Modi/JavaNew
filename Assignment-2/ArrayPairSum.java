import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        int sum = 0;
        
        // Take the minimum element from each pair
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        ArrayPairSum solution = new ArrayPairSum();
        
        // Example usage
        int[] nums = {1, 4, 3, 2};
        int maxSum = solution.arrayPairSum(nums);
        
        System.out.println("Maximum Sum: " + maxSum);
    }
}