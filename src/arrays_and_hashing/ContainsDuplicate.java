package arrays_and_hashing;

import java.util.Scanner;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter the elements in Array");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }

        boolean result = solver.hasDuplicate(userArray);
        System.out.println("Duplicate of the number is: " + result);

        scanner.close();
    }
}
