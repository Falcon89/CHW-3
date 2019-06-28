package com.cursor.wh3.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumbers {
    /**
     * Create method removeNumbersDivisible, **Remove all numbers where divisible by 3
     */
    public static void removeNumbersDivisible() {
        Integer[] numbers = {3, 9, 11, 18, 20, 22};
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("Task 7 -->");
        for (int i = 0; i < list.size(); i++) {
            if (((list.get(i)) % 3) == 0) {
                System.out.println(list.get(i) + " Divisible by 3");
            } else if (((list.get(i)) % 3) != 0) {
                list.remove(i);
            }
        }
    }
}

