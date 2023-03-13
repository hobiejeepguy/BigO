package org.hobiejeepguy.algo;

import org.hobiejeepguy.Main;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class Find {

    public static void printEvenNumbers(boolean isDebugMode, int[] sampleSet) {
        ArrayList<Integer> evens = new ArrayList();

        if(isDebugMode) System.out.println(Arrays.toString(sampleSet));

        for (int curVal : sampleSet) {
            if (curVal % 2 == 0 && curVal != 0)
                evens.add(Integer.valueOf(curVal));
        }

        if(isDebugMode) System.out.println(Arrays.toString(evens.toArray()));
    }

    public static void doLinearSearch(boolean isDebugMode, char[] sampleSet, char target) {
        ArrayList<Integer> locations = new ArrayList<Integer>();

        if(isDebugMode) System.out.println(Arrays.toString(sampleSet));
        if(isDebugMode) System.out.println(target);

        for(int stp = 0; stp < sampleSet.length; stp++) {
            if(sampleSet[stp] == target)
                locations.add(stp);
        }

        if(isDebugMode) System.out.println(Arrays.toString(locations.toArray()));
    }


    public static void doBreadthFirstSearch(int size) {
        char[] cells = new char[]{'.','.','.','X','.','.'};
        boolean[] visited = new boolean[6];
        int[][] adjacencyList = new int[][] {
                {1},
                {0,2,4},
                {1,3},
                {2},
                {1,5},
                {4}
        };
        processBFSnode(adjacencyList, cells, visited, 0);

    }

    public static boolean processBFSnode(int[][] adjacencyList, char[] cells, boolean[] visited, int currCell) {
        if(visited[currCell])
            return false;

        visited[currCell] = true;

        if(cells[currCell] == 'X')
            return true;

        boolean found = false;
        for(int stp = 0; stp < adjacencyList[currCell].length && !found; stp++) {

        }

        return false;
    }

    public static void doDepthFirstSearch(int size, int moder) {

    }

}
