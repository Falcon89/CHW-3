package com.cursor.wh3.tasks;

import java.util.Arrays;
import java.util.Collections;

public class ArrayCounts {
    /**
     * Create method countsArrayDESC, Sort them DESC(reverseOrder)
     */
    public static void countsArrayDESC() {
        Integer array[] = {2, 3, 1, 7, 11};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Task 3 -->" + Arrays.toString(array));
    }
}
