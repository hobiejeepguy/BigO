package org.hobiejeepguy;

import org.hobiejeepguy.algo.Find;
import org.hobiejeepguy.algo.Sort;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //Find.findEvenNumbers(10, 100);
        Sort.doBubbleSort(10, 100);
    }

    // Helper function
    public static int[] generateRandomInts(int size, int moder) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Random rand = new Random();

        for(int stp=0; stp<size; stp++) {
            intArray.add(Integer.valueOf(rand.nextInt() % moder));
        }

        int[] ret = new int[intArray.size()];
        for(int stp = 0; stp<intArray.size(); stp++) {
            if(intArray.get(stp) < 0)
                ret[stp] = intArray.get(stp) * -1;
            else
                ret[stp] = intArray.get(stp);
        }
        return ret;
    }
}