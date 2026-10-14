package two_pointers;

import java.util.Scanner;
class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, area);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] heights = new int[size];

        System.out.println("Enter the elements in Array (space-separated):");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            heights[i] = Integer.parseInt(parts[i]);
        }

        int result = solver.maxArea(heights);
        System.out.println("Maximum water: " + result);

        scanner.close();
    }
}