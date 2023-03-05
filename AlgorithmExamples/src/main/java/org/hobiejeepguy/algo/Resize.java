package org.hobiejeepguy.algo;

public class Resize {
    public static char[] insert(char[] oldValues, int pos, char newVal) {
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

    public static char[] remove(char[] oldValues, int pos) {
        char[] newValues = new char[oldValues.length -1];

        if(pos < oldValues.length-1) {
            for(int stp = pos; stp < oldValues.length-1; stp++) {
                oldValues[stp] = oldValues[stp+1];
            }
        }

        for(int stp = 0; stp < newValues.length; stp++) {
            newValues[stp] = oldValues[stp];
        }
        return newValues;
    }
}
