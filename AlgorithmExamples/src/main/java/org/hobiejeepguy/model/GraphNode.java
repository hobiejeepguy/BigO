package org.hobiejeepguy.model;

public class GraphNode {

    int rowPos;
    int colPos;

    public GraphNode()
    {
        new GraphNode(0,0);
    }
    public GraphNode(int rowposition, int colposition){
        rowPos = rowposition;
        colPos = colposition;
    }
}
