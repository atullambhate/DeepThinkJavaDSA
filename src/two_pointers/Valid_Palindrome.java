package two_pointers;

import java.util.Scanner;
public class Valid_Palindrome {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !alphaNum(s.charAt(left))) {
                left++;
            }
            while (right > left && !alphaNum(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
    public static void main(String[] args) {
        Valid_Palindrome solver = new Valid_Palindrome();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string (s):");
        String s = scanner.nextLine();

        boolean result = solver.isPalindrome(s);
        System.out.println("Is palindrome? " + result);

        scanner.close();
    }
}