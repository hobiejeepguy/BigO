package org.hobiejeepguy.algo;

import org.hobiejeepguy.Main;

public class Find {

    public static void printEvenNumbers() {
        int[] intArray = Main.generateRandomInts(100, 1000);

        for (int arrayVal : intArray) {
            if (arrayVal % 2 == 0)
                System.out.println(arrayVal);
        }

    }
}
