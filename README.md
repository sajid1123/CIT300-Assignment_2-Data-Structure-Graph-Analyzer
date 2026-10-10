# CIT300 Data Structure & Graph Performance Analyzer

Java console application developed for CIT300 Data Structures and Algorithms – Graded Practical Assignment 2.

This program lets the user work with common data structures (array, stack, queue, linked list and graph) and compare how fast different algorithms work.

## How to Run

1. Open the `src` folder.
2. Compile all Java files:
   ```
   javac *.java
   ```
3. Run the program:
   ```
   java Main
   ```

## Features

- Array operations: insert, delete, search and display
- Stack operations: push, pop, peek and display
- Queue operations: enqueue, dequeue, peek and display
- Linked list operations: insert, delete, search and display
- Searching: linear search and binary search with step count and time
- Graph operations: add vertex, add edge, display, BFS and DFS traversal
- Performance comparison: linear vs binary search, BFS vs DFS, and complexity summary
- Safe input handling that checks for wrong or empty input

## Group Members

| Member | Student ID | Responsibility |
|---|---|---|
| M.S.M Sajid | 23DA2-1090 | Base Utilities, Array and Stack |
| A.N. Fathima Sipani | 23DA2-1101 | Queue, Linked List and Searching |
| A.J. Jasan | 23DA2-1082 | Graph and Performance Analysis |
| A.R. Jasana | 23DA2-1081 | System Controller and Main Application |

## 7. Individual Contribution

Each member made their own part of the project. The details are given below.

### Member 1

- **Student Name:** M.S.M Sajid
- **Student ID:** 23DA2-1090
- **Assigned Responsibility:** Base Utilities, Array and Stack
- **Individual Contribution:**
  - Created `InputHelper` class to read and check user input
  - Added safe methods to read numbers and text without crashing on wrong input
  - Created `ArrayManager` class for array operations
  - Implemented insert, delete, search and display for the array
  - Added automatic array size increase when the array becomes full
  - Created `StackManager` class for stack operations
  - Implemented push, pop, peek and display for the stack
  - Tested the array and stack features

### Member 2

- **Student Name:** A.N. Fathima Sipani
- **Student ID:** 23DA2-1101
- **Assigned Responsibility:** Queue, Linked List and Searching
- **Individual Contribution:**
  - Created `QueueManager` class for queue operations
  - Implemented enqueue, dequeue, peek and display using a circular queue
  - Created `LinkedListManager` class for linked list operations
  - Implemented insert, delete, search and display using linked nodes
  - Created `SearchAnalyzer` class for searching algorithms
  - Implemented linear search and binary search with step counting and time taken
  - Tested the queue, linked list and search features

### Member 3

- **Student Name:** A.J. Jasan
- **Student ID:** 23DA2-1082
- **Assigned Responsibility:** Graph and Performance Analysis
- **Individual Contribution:**
  - Created `GraphManager` class for graph operations
  - Implemented add vertex and add edge (undirected graph) using adjacency list
  - Implemented BFS traversal using a queue
  - Implemented DFS traversal using recursion
  - Counted the number of steps and measured the time for BFS and DFS
  - Created `PerformanceAnalyzer` class for comparison reports
  - Implemented comparison of linear vs binary search and BFS vs DFS
  - Added a complexity summary for all data structures and algorithms
  - Tested the graph and performance features

### Member 4

- **Student Name:** A.R. Jasana
- **Student ID:** 23DA2-1081
- **Assigned Responsibility:** System Controller and Main Application
- **Individual Contribution:**
  - Created `DataStructureGraphAnalyzer` class as the main controller
  - Built the main menu and all sub menus for each feature
  - Connected all member modules (array, stack, queue, linked list, search, graph) together
  - Added "Display All Results" option to show current data of all structures
  - Created `Main` class as the program entry point
  - Tested the full program flow and menu navigation
