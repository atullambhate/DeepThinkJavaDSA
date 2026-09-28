package basic_logics_programs;

import java.util.Scanner;
public class AdditionOfTwoNumbers {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbers solver = new AdditionOfTwoNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (a):");
        int a = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Enter the second number (b):");
        int b = Integer.parseInt(scanner.nextLine().trim());

        int result = solver.add(a, b);
        System.out.println("Sum: " + result);

        scanner.close();
    }
}