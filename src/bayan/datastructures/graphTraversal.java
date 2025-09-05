package bayan.datastructures;

import java.util.*;

public class GraphTraversal {

  private Map<Integer, List<Integer>> graph = new HashMap<>();

  public void addEdge(int u, int v) {
    graph.putIfAbsent(u, new ArrayList<>());
    graph.putIfAbsent(v, new ArrayList<>());
    graph.get(u).add(v);
    graph.get(v).add(u);
  }

  public void bfs(int start) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    visited.add(start);

    while (!q.isEmpty()) {
      int node = q.poll();
      System.out.print(node + " ");
      for (int neighbor : graph.get(node)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          q.add(neighbor);
        }
      }
    }
  }

  public void dfsRecursive(int start) {
    Set<Integer> visited = new HashSet<>();
    dfsHelper(start, visited);
  }

  private void dfsHelper(int node, Set<Integer> visited) {
    visited.add(node);
    System.out.print(node + " ");
    for (int neighbor : graph.get(node)) {
      if (!visited.contains(neighbor)) {
        dfsHelper(neighbor, visited);
      }
    }
  }

  public void dfsIterative(int start) {
    Set<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(start);

    while (!stack.isEmpty()) {
      int node = stack.pop();
      if (!visited.contains(node)) {
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)) {
          if (!visited.contains(neighbor)) {
            stack.push(neighbor);
          }
        }
      }
    }
  }
}
