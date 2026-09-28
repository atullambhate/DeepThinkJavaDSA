package arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String string : strs) {
            result.append(string.length()).append('#').append(string);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings solver = new EncodeAndDecodeStrings();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        List<String> strs = new ArrayList<>();

        System.out.println("Enter the strings (one per line, empty line allowed):");
        for (int i = 0; i < size; i++) {
            strs.add(scanner.nextLine());
        }

        String encoded = solver.encode(strs);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = solver.decode(encoded);
        System.out.println("Decoded: " + decoded);

        scanner.close();
    }
}