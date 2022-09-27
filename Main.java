package com.rajesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] graph = {
                {0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0}
        };
        Graph g = new Graph(5);//no of vertices is 5
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);

        g.printadjList();
        //printMatrix(graph);
        g.bfs(0);
        g.dfs(0);


    }
    public static void printMatrix(int[][] graph){
        System.out.println("Print matrix called");
        for(int i = 0;i< graph.length;i++){
            System.out.println("vertex "+i );
            for(int j=0;j<graph[0].length;j++){
                if(graph[i][j]==1) {
                    System.out.print(" " +j);
                }
            }
            System.out.println();
        }
    }
}
