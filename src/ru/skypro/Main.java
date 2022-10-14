package ru.skypro;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<Integer>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<String>(List.of("abc", "abc", "bcd", "bcd", "e"));

    public static void main(String[] args) {

//        //Задание 1
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        //Задание 2
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && prevNum != num) {
                System.out.println(num);
                prevNum = num;
            }
        }

        //Задание 3
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        //Задание 4
        Set<String> uniqueWords1 = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
