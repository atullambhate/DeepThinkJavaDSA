package arrays_and_hashing;

import java.util.Scanner;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] nums = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Enter the target:");
        int target = Integer.parseInt(scanner.nextLine().trim());

        int[] result = solver.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

        scanner.close();
    }
}