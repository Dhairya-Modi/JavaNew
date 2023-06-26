import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        // Create a map to store the frequency of each number in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLen = 0;
        
        // Iterate over the unique numbers in the array
        for (int num : frequencyMap.keySet()) {
            // Check if there is a number with a frequency that differs by 1
            if (frequencyMap.containsKey(num + 1)) {
                int currentLen = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        
        // Example usage
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = solution.findLHS(nums);
        
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequenceLength);
    }
}