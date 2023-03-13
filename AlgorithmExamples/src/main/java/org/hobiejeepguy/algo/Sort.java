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
}
