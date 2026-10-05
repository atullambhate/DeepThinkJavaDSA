package two_pointers;

import java.util.Scanner;
public class ThreeSum {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] numbers = new int[size];

        System.out.println("Enter the elements in Array (space-separated, sorted):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Enter the target:");
        int target = Integer.parseInt(scanner.nextLine().trim());

        int[] result = solver.twoSum(numbers, target);

        System.out.println("Indices (1-indexed): [" + result[0] + ", " + result[1] + "]");

        scanner.close();
    }
}