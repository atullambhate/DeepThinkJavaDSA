package arrays_and_hashing;

import java.util.Arrays;
import java.util.Scanner;
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int result = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            result = Math.max(result, streak);
        }

        return result;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solver = new LongestConsecutiveSequence();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] nums = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        if (size > 0) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            for (int i = 0; i < size; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
        }

        int result = solver.longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + result);

        scanner.close();
    }
}