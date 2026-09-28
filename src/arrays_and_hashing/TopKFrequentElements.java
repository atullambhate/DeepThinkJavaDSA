package arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            array.add(new int[]{entry.getValue(), entry.getKey()});
        }

        array.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array.get(i)[1];
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements solver = new TopKFrequentElements();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] nums = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Enter k:");
        int k = Integer.parseInt(scanner.nextLine().trim());

        int[] result = solver.topKFrequent(nums, k);

        System.out.print("Top " + k + " frequent elements: [");
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