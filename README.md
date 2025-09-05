# data-structures-week-implementation

══════════════════════════════════════ Data Structures ══════════════════════════════════════

📌 **Overview**  
This repository contains implementations of fundamental data structures in Java.  
It follows the course: *Data Structures Easy to Advanced Course - Full Tutorial from a Google Engineer*.  

══════════════════════════════════════

## 📊 Day 1 Progress
![stack_diagram](https://github.com/user-attachments/assets/a8def8c4-1020-4e53-8e24-4180c6ccfaf3)<svg viewBox="0 0 800 500" xmlns="http://www.w3.org/2000/svg">
  

| Structure            | Key Features | Time Complexity | Space | Usage Example |
|----------------------|--------------|-----------------|-------|---------------|
| Dynamic Array        | Resizable array, auto-resize | Access: O(1), Insert end: O(1)*, Insert idx: O(n), Delete: O(n) | O(n) | `arr.add(10); arr.get(1);` |
| Singly Linked List   | Node-based list | Access: O(n), Insert head: O(1), Insert tail: O(n), Delete head: O(1), tail: O(n) | O(n) | `list.addFirst(5); list.addLast(10);` |
| Stack (Array)        | LIFO using array | Push/Pop/Peek: O(1) | O(n) | `stack.push(1); stack.pop();` |
| Stack (Linked List)  | LIFO using linked list | Push/Pop/Peek: O(1) | O(n) | `stack.push(100); stack.peek();` |

══════════════════════════════════════

## 📊 Day 2 Progress

<img width="800" height="400" alt="queue_diagram 1" src="https://github.com/user-attachments/assets/8c6ef71f-73a2-4bc4-8030-4633a6f441c2" />

| Structure              | Key Features | Time Complexity | Space | Usage Example |
|------------------------|--------------|-----------------|-------|---------------|
| Queue (Array)          | FIFO using array | Enqueue: O(1), Dequeue: O(1), Peek: O(1) | O(n) | `q.enqueue(10); q.dequeue();` |
| Queue (Linked List)    | FIFO using linked list | Enqueue/Dequeue: O(1) | O(n) | `q.enqueue(1); q.dequeue();` |
| Doubly Linked List     | Nodes with prev & next | Access: O(n), Insert/Delete: O(1) | O(n) | `dll.addFirst(3); dll.addLast(7);` |
| Circular Linked List   | Last node links to head | Same as singly linked list | O(n) | `cll.add(1); cll.add(2);` |

══════════════════════════════════════

## 📊 Day 3 Progress

| Structure              | Key Features | Time Complexity | Space | Usage Example |
|------------------------|--------------|-----------------|-------|---------------|
| Binary Tree            | Each node has ≤ 2 children | Insert/Search: O(n) | O(n) | `tree.insert(10); tree.insert(20);` |
| Binary Search Tree     | Ordered: Left < Root < Right | Insert/Search/Delete: O(log n) avg, O(n) worst | O(n) | `bst.insert(50); bst.search(30);` |
| Tree Traversals        | Inorder, Preorder, Postorder | O(n) | O(n) | `tree.inorder(); tree.preorder();` |

══════════════════════════════════════

## 📊 Day 4 Progress

| Structure              | Key Features | Time Complexity | Space | Usage Example |
|------------------------|--------------|-----------------|-------|---------------|
| Hash Table (Chaining)  | Key-value pairs, collisions handled by linked list | Insert/Search/Delete: O(1) avg, O(n) worst | O(n) | `ht.put("name", "Bayan"); ht.get("name");` |
| Min Heap               | Complete tree, root = min | Insert: O(log n), ExtractMin: O(log n), Peek: O(1) | O(n) | `heap.insert(3); heap.extractMin();` |
| Graph (Adj. List)      | Graph with adjacency list | Add edge: O(1), Traverse: O(V+E) | O(V+E) | `g.addEdge(0,1); g.printGraph();` |

══════════════════════════════════════

## 📊 Day 5 Progress

| Structure              | Key Features | Time Complexity | Space | Usage Example |
|------------------------|--------------|-----------------|-------|---------------|
| Trie                   | Prefix tree for strings | Insert/Search: O(L) | O(ALPHABET_SIZE * n) | `trie.insert("apple"); trie.contains("apple");` |
| Union-Find (Disjoint Set) | Union & find sets | Find/Union: O(α(n)) ≈ O(1) | O(n) | `uf.unify(0,1); uf.connected(0,1);` |
| Graph Traversals (BFS/DFS) | BFS: level-order, DFS: depth-order | O(V+E) | O(V) | `g.BFS(0); g.DFS(0);` |

══════════════════════════════════════

## 🚀 How to Run

| Step | Command |
|------|----------|
| 1 | `git clone https://github.com/YOUR_USERNAME/data-structures-week-implementation.git` |
| 2 | `cd data-structures-week-implementation` |
| 3 | `javac src/bayan/datastructures/*.java` |
| 4 | `java src/bayan/datastructures/Main` |

══════════════════════════════════════
