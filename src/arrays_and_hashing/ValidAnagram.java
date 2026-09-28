package arrays_and_hashing;

import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] unsortedS = s.toCharArray();
        char[] unsortedT = t.toCharArray();

        Arrays.sort(unsortedS);
        Arrays.sort(unsortedT);

        String sortS = new String(unsortedS);
        String sortT = new String(unsortedT);

        return sortS.equals(sortT);
    }

    public static void main(String[] args) {
        ValidAnagram solver = new ValidAnagram();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string (s):");
        String s = scanner.nextLine();

        System.out.println("Enter the second string (t):");
        String t = scanner.nextLine();

        boolean result = solver.isAnagram(s, t);
        System.out.println("Are they anagrams? " + result);

        scanner.close();
    }
}