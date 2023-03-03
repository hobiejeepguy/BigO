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

    public static void doBreadthFirstSearch(int size, int moder) {
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
