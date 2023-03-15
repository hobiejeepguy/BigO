package org.hobiejeepguy.algo;

import org.hobiejeepguy.Main;

import java.util.Arrays;

public class Sort {
    public static char[] doBubbleSort(boolean isDebugMode, char[] sampleSet) {

        for(int stp=sampleSet.length; stp>0; stp--) {
            for(int pos=0; pos<stp-1; pos++) {
                char valL = sampleSet[pos];
                char valR = sampleSet[pos+1];
                if(valL > valR) {
                    sampleSet[pos] = valR;
                    sampleSet[pos+1] = valL;
                }
            }
        }

        if(isDebugMode) System.out.println(Arrays.toString(sampleSet));

        return sampleSet;
    }

    public static char[] doSelectionSort(boolean isDebugMode, char[] sampleSet) {

        if(isDebugMode) System.out.println(Arrays.toString(sampleSet));

        for(int stp1 = 0; stp1 < sampleSet.length; stp1++) {
            int min = stp1;
            for (int stp2 = stp1; stp2 < sampleSet.length; stp2++) {
                if(sampleSet[stp2] < sampleSet[min]) {
                    min = stp2;
                }
            }
            Main.swapValues(sampleSet, stp1, min);
        }

        if(isDebugMode) System.out.println(Arrays.toString(sampleSet));

        return sampleSet;
    }

}
