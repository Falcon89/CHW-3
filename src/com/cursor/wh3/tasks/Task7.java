package com.cursor.wh3.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    /**
     * Create method removeNumbersDivisible, **Remove all numbers where divisible by 3
     */
    public static void removeNumbersDivisible() {
        Integer[] numbers = {3, 9, 11, 18, 20, 22};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
        boolean isDivisible = false;
        System.out.println("Task 7 -->");
        for (int num : list) {
            if (num % 3 == 0) {
                isDivisible = false;
                System.out.println(num + " Divisible by 3");
            } else if (isDivisible == true) {
                list.remove(list);
            }
        }
    }
}

