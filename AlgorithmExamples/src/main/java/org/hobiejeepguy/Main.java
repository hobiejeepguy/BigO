package org.hobiejeepguy;

import org.hobiejeepguy.algo.Find;
import org.hobiejeepguy.algo.Resize;
import org.hobiejeepguy.algo.Sort;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Find.doLinearSearch(10, true);
        //Find.printEvenNumbers(22);
        //Find.doBreadthFirstSearch(0);
        //Sort.doBubbleSort(10);
        //System.out.println(Arrays.toString(testValuesChar));
        //System.out.println(Arrays.toString(Resize.remove(testValuesChar, 2)));
    }

    // Helper functions
    public static int[] generateRandomInts(int size) {
        int[]  valArray = new int[size];

        for(int stp = 0; stp < size; stp++) {
            valArray[stp] = (int)(Math.random()*1000)%size;
        }

        return valArray;
    }

    public static char[] generateRandomChars(int size) {
        char[] valArray = new char[size];

        for(int stp = 0; stp < size; stp++) {
            valArray[stp] = (char)(((Math.random()*100)%93)+33);
            //valArray[stp] = (char);
        }

        return valArray;
    }

    public static char getRandomChar() {
        return (char)(((Math.random()*100)%93)+33);
    }

}