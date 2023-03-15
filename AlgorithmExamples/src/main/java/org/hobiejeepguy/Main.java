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
        //int[] sampleSet = Main.generateRandomInts(size);
        char[] sampleSet = Main.generateRandomChars(60);
        char target = Main.getRandomChar();

        //Find.doLinearSearch(true, sampleSet);
        //Find.doBinarySearch(true, sampleSet, target);
        //Find.printEvenNumbers(22, true);
        //Find.doBreadthFirstSearch(0);
        //Sort.doBubbleSort(true, sampleSet);
        //Sort.doSelectionSort(true, sampleSet);
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

    public static char[] swapValues(char[] sampleSet, int pos1, int pos2) {
        char val1 = sampleSet[pos1];
        char val2 = sampleSet[pos2];

        sampleSet[pos1] = val2;
        sampleSet[pos2] = val1;

        return sampleSet;
    }

}