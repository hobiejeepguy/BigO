package org.hobiejeepguy.algo;

public class Resize {
    public static char[] insert(char[] oldValues, char newVal, int pos) {
        char[] newValues = new char[oldValues.length + 1];

        for(int stp = 0; stp < pos; stp++) {
            newValues[stp] = oldValues[stp];
        }

        newValues[pos] = newVal;

        for(int stp = pos; stp < oldValues.length; stp++) {
            newValues[stp+1] = oldValues[stp];
        }

        return newValues;
    }
}
