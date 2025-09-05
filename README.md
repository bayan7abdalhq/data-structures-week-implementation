<svg viewBox="0 0 800 400" xmlns="http://www.w3.org/2000/svg">
  <!-- Background -->
  <rect width="800" height="400" fill="#f8f9fa"/>
  
  <!-- Title -->
  <text x="400" y="30" text-anchor="middle" font-family="Arial, sans-serif" font-size="24" font-weight="bold" fill="#2c3e50">Queue Data Structure (FIFO)</text>
  
  <!-- Queue container -->
  <rect x="150" y="120" width="500" height="80" fill="none" stroke="#34495e" stroke-width="3" rx="5"/>
  
  <!-- Queue elements -->
  <rect x="170" y="130" width="70" height="60" fill="#3498db" stroke="#2980b9" stroke-width="2" rx="3"/>
  <text x="205" y="166" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="white">A</text>
  
  <rect x="260" y="130" width="70" height="60" fill="#3498db" stroke="#2980b9" stroke-width="2" rx="3"/>
  <text x="295" y="166" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="white">B</text>
  
  <rect x="350" y="130" width="70" height="60" fill="#3498db" stroke="#2980b9" stroke-width="2" rx="3"/>
  <text x="385" y="166" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="white">C</text>
  
  <rect x="440" y="130" width="70" height="60" fill="#3498db" stroke="#2980b9" stroke-width="2" rx="3"/>
  <text x="475" y="166" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="white">D</text>
  
  <rect x="530" y="130" width="70" height="60" fill="#e74c3c" stroke="#c0392b" stroke-width="2" rx="3"/>
  <text x="565" y="166" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="white">E</text>
  
  <!-- Front and Rear labels -->
  <text x="205" y="110" text-anchor="middle" font-family="Arial, sans-serif" font-size="14" font-weight="bold" fill="#e74c3c">FRONT</text>
  <line x1="190" y1="115" x2="220" y2="115" stroke="#e74c3c" stroke-width="2" marker-end="url(#arrowhead)"/>
  
  <text x="565" y="110" text-anchor="middle" font-family="Arial, sans-serif" font-size="14" font-weight="bold" fill="#27ae60">REAR</text>
  <line x1="550" y1="115" x2="580" y2="115" stroke="#27ae60" stroke-width="2" marker-end="url(#arrowhead)"/>
  
  <!-- Operations -->
  <!-- Enqueue operation -->
  <rect x="70" y="250" width="80" height="40" fill="#27ae60" stroke="#229954" stroke-width="2" rx="5"/>
  <text x="110" y="274" text-anchor="middle" font-family="Arial, sans-serif" font-size="14" font-weight="bold" fill="white">ENQUEUE</text>
  
  <rect x="30" y="300" width="40" height="30" fill="#f39c12" stroke="#e67e22" stroke-width="2" rx="3"/>
  <text x="50" y="320" text-anchor="middle" font-family="Arial, sans-serif" font-size="12" font-weight="bold" fill="white">F</text>
  
  <path d="M 80 315 Q 120 280 550 140" fill="none" stroke="#27ae60" stroke-width="3" marker-end="url(#arrowhead)"/>
  <text x="300" y="260" text-anchor="middle" font-family="Arial, sans-serif" font-size="12" fill="#27ae60">Add to rear</text>
  
  <!-- Dequeue operation -->
  <rect x="650" y="250" width="80" height="40" fill="#e74c3c" stroke="#c0392b" stroke-width="2" rx="5"/>
  <text x="690" y="274" text-anchor="middle" font-family="Arial, sans-serif" font-size="14" font-weight="bold" fill="white">DEQUEUE</text>
  
  <rect x="710" y="300" width="40" height="30" fill="#f39c12" stroke="#e67e22" stroke-width="2" rx="3"/>
  <text x="730" y="320" text-anchor="middle" font-family="Arial, sans-serif" font-size="12" font-weight="bold" fill="white">A</text>
  
  <path d="M 205 200 Q 350 260 720 300" fill="none" stroke="#e74c3c" stroke-width="3" marker-end="url(#arrowhead)"/>
  <text x="450" y="280" text-anchor="middle" font-family="Arial, sans-serif" font-size="12" fill="#e74c3c">Remove from front</text>
  
  <!-- Key properties -->
  <text x="400" y="350" text-anchor="middle" font-family="Arial, sans-serif" font-size="16" font-weight="bold" fill="#2c3e50">FIFO: First In, First Out</text>
  <text x="400" y="375" text-anchor="middle" font-family="Arial, sans-serif" font-size="14" fill="#7f8c8d">Elements are added at the rear and removed from the front</text>
  
  <!-- Arrow marker definition -->
  <defs>
    <marker id="arrowhead" markerWidth="10" markerHeight="7" refX="9" refY="3.5" orient="auto">
      <polygon points="0 0, 10 3.5, 0 7" fill="#34495e"/>
    </marker>
  </defs>
</svg>
# data-structures-week-implementation
══════════════════════════════════════
           Data Structures 
══════════════════════════════════════

📌 Overview  
This repository contains implementations of fundamental data structures in Java.  
It follows the course: Data Structures Easy to Advanced Course - Full Tutorial from a Google Engineer.  

══════════════════════════════════════

📊 Day 1 Progress  

| Item                  | Details                                                                 |
|-----------------------|-------------------------------------------------------------------------|
| Language Chosen       | Java                                                                    |
| Data Structures       | Dynamic Array, Singly Linked List, Stack (Array), Stack (Linked List)   |

══════════════════════════════════════

📂 Project Structure  

| Path                                   | Description               |
|----------------------------------------|---------------------------|
| src/bayan/datastructures/DynamicArray.java   | Dynamic Array implementation |
| src/bayan/datastructures/SinglyLinkedList.java | Singly Linked List implementation |
| src/bayan/datastructures/ArrayStack.java      | Stack using Array          |
| src/bayan/datastructures/LinkedListStack.java | Stack using Linked List    |

══════════════════════════════════════

📖 Implementations  

| Structure         | Key Features                                                  |
|-------------------|---------------------------------------------------------------|
| Dynamic Array     | Resizable array, supports add(), remove(), get(), auto-resize |
| Singly Linked List| Node-based, supports addFirst(), addLast(), remove(), search()|
| Stack (Array)     | Stack operations using arrays                                 |
| Stack (LinkedList)| Stack operations using linked list                            |

══════════════════════════════════════

🚀 How to Run  

| Step | Command/Action                                                                  |
|------|---------------------------------------------------------------------------------|
| 1    | Clone repo → `git clone https://github.com/YOUR_USERNAME/data-structures-week-implementation.git` |
| 2    | Enter folder → `cd data-structures-week-implementation`                         |
| 3    | Compile → `javac src/bayan/datastructures/*.java`                               |
| 4    | Run → `java src/bayan/datastructures/Main`                                      |

══════════════════════════════════════
