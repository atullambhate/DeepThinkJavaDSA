package arrays_and_hashing;

import java.util.Scanner;
public class ProductsOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int product = 1;

            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    product *= nums[j];
                }
            }

            res[i] = product;
        }

        return res;
    }

    public static void main(String[] args) {
        ProductsOfArrayExceptSelf solver = new ProductsOfArrayExceptSelf();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] nums = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int[] result = solver.productExceptSelf(nums);

        System.out.print("Products except self: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}