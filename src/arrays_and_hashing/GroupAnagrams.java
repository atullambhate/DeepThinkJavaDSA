package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            result.putIfAbsent(sortedString, new ArrayList<>());
            result.get(sortedString).add(s);
        }

        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solver = new GroupAnagrams();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int size = Integer.parseInt(scanner.nextLine().trim());

        String[] strs = new String[size];

        System.out.println("Enter the strings (one per line, empty line allowed):");
        for (int i = 0; i < size; i++) {
            strs[i] = scanner.nextLine();
        }

        List<List<String>> result = solver.groupAnagrams(strs);

        System.out.println("Grouped anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }

        scanner.close();
    }
}