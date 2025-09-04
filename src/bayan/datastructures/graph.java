import java.util.*;

package bayan.datastructures;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int v1, int v2) {
        adjList.putIfAbsent(v1, new ArrayList<>());
        adjList.putIfAbsent(v2, new ArrayList<>());
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.println(v + " -> " + adjList.get(v));
        }
    }
}
