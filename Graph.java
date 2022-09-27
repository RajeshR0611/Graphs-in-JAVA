package com.rajesh;
import java.util.*;
public class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    public Graph(int v){
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printadjList(){
        //System.out.println(adjList);
        for(int i=0;i<adjList.size();i++){
            System.out.println("Adj list of vertex "+i);
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.println(adjList.get(i).get(j));
            }
        }
    }

    public void bfs(int v){
        System.out.println("Breath First Search");
        int VS = adjList.size();
        boolean[] Visited = new boolean[VS];

        Visited[v] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while(q.size()!=0){
            int vertex = q.remove(); //dequeue
            System.out.print(vertex+" ");
            for(int i=0;i<adjList.get(vertex).size();i++){
               // for(int j=0;j<adjList.get(i).size();j++){
                int av = adjList.get(vertex).get(i);
                if(!Visited[av]){
                    q.add(av);
                    Visited[av] = true;
                }
                //}
            }
            /*for(int k : adjList.get(vertex)){
                if(!Visited[k]){
                    q.add(k);
                    Visited[k] = true;
                }
            }*/
        }
    }
    public void dfs(int v){
        int V = adjList.size();
        boolean[] visited = new boolean[V];
        System.out.println();//for alignment
        System.out.println("Depth Search Tree:");
        dfs2(visited,v);
    }
    public void dfs2(boolean[] visited,int v){
        System.out.print(v+" ");
        visited[v] = true;
       /* for(int i =0;i<adjList.get(v).size();i++){
            int av = adjList.get(v).get(i);
            if(!visited[av]){
                dfs2(visited,av);

            }
        }*/

        for(int k :adjList.get(v)){
            if(!visited[k]){
                dfs2(visited,k);
            }

        }
    }

}
