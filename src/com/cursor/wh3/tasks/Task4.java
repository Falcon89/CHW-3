package com.cursor.wh3.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    /**
     * Create method replaceValueArrayList, Replace valu "Tree" by "Three"
     */
    public void replaceValueArrayList() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");
        System.out.println("Task 4 -->" + "Initial value of the array " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("Tree")) {
                list.set(i, "Three");
            }
        }
        System.out.println("Value array after finding <Tree> and replacing the value in <Three> " + list);
    }

}

