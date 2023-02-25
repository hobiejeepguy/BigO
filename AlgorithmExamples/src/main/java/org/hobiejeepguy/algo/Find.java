package org.hobiejeepguy.algo;

import org.hobiejeepguy.Main;

public class Find {

    public static void findEvenNumbers(int size, int moder) {
        int[] intArray = Main.generateRandomInts(size, moder);

        for (int arrayVal : intArray) {
            if (arrayVal % 2 == 0)
                System.out.println(arrayVal);
        }

    }
}
