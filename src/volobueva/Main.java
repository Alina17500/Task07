package volobueva;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < MinCycle.N; i++)
            MinCycle.graph[i] = new Vector<>();

        System.out.println("Number of nodes :");
        int n = 5;

        MinCycle.addEdge(0, 1);
        MinCycle.addEdge(0, 4);
        MinCycle.addEdge(0, 3);
        MinCycle.addEdge(0, 2);
        MinCycle.addEdge(2, 3);
        MinCycle.addEdge(3, 4);
        MinCycle.addEdge(3, 1);
        MinCycle.addEdge(4, 1);

        System.out.println("\n The minimum cycle in the graph : " + MinCycle.findShortestCycle(n));
    }
}