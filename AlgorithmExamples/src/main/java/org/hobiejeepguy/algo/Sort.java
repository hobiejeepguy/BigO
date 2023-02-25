package org.hobiejeepguy.algo;

import org.hobiejeepguy.Main;

public class Sort {
    public static void doBubbleSort(int size, int moder) {

        int[] valsToSort = Main.generateRandomInts(size, moder);

        for(int stp=valsToSort.length; stp>0; stp--) {
            for(int pos=0; pos<stp-1; pos++) {
                int valL = valsToSort[pos];
                int valR = valsToSort[pos+1];
                if(valL > valR) {
                    valsToSort[pos] = valR;
                    valsToSort[pos+1] = valL;
                }
            }
        }

        for(int stp=0; stp<valsToSort.length; stp++) {
            System.out.println(valsToSort[stp]);
        }

    }
}
