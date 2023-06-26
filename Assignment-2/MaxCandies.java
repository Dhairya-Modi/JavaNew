import java.util.HashSet;
import java.util.Set;

public class MaxCandies {
    public int maxCandies(int[] candyType) {
        // Calculate the maximum number of candies Alice can eat
        int maxCandies = candyType.length / 2;
        
        // Count the number of different types of candies
        Set<Integer> candySet = new HashSet<>();
        for (int candy : candyType) {
            candySet.add(candy);
        }
        
        // Return the minimum of maxCandies and the number of different types of candies
        return Math.min(maxCandies, candySet.size());
    }

    public static void main(String[] args) {
        MaxCandies solution = new MaxCandies();
        
        // Example usage
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxNumOfCandies = solution.maxCandies(candyType);
        
        System.out.println("Maximum number of different types of candies Alice can eat: " + maxNumOfCandies);
    }
}