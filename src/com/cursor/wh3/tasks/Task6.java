package com.cursor.wh3.tasks;

import java.util.Arrays;

public class Task6 {
    /**
     * Create method sortingDeterminingAverageNumber, average of a list of numbers
     */
    public void sortingDeterminingAverageNumber() {
        Integer array[] = {32, 66, 9, 55, 4, 33, 85, 2, 93, 42, 57, 43, 311};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int avg = sum / array.length;
        System.out.println("Task 6 -->Average of a list " + avg);
    }
}

