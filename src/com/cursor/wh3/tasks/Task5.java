package com.cursor.wh3.tasks;

public class Task5 {
    /**
     * Create method countingSumAllPositiveNumbers, on condition of task
     */
    public void countingSumAllPositiveNumbers() {
        Integer array[] = {1, 5, 6, -3, 16, -1, -6, 14};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
            else if (array[i] == null) {
                sum = sum + array[i];
            }
        }
        System.out.println("Task 5 -->Sum all positive numbers " + sum);
    }
}
