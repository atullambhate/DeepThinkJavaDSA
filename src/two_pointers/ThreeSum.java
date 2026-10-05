package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates on the left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates on the right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] nums = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        List<List<Integer>> result = solver.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);

        scanner.close();
    }
}