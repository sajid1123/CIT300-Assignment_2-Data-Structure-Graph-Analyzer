# CIT300 Data Structure & Graph Performance Analyzer

Java console application developed for **CIT300 Data Structures and Algorithms – Graded Practical Assignment 2**.

## Project Overview

This project is a console-based Java application created to help understand and practice how common data structures and algorithms work.

The program allows users to store and manage data using five different data structures: Array, Stack, Queue, Linked List, and Graph. Users can interact with each structure through an easy-to-use menu, add and remove items, and see how they work internally. In addition, the program lets users run searching and graph traversal algorithms, counting the steps taken and measuring the time in nanoseconds to compare their performance.

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

### 1. Array Operations
- Insert numbers into the array
- Automatically increases the array size when it gets full
- Delete numbers by shifting remaining elements
- Search for a number and return its index
- Display all current elements in the array

### 2. Stack Operations (LIFO - Last In, First Out)
- Push: add a new number to the top of the stack
- Pop: remove and return the top number
- Peek: look at the top number without removing it
- Display all items from top to bottom
- Prevents errors when trying to pop or peek from an empty stack

### 3. Queue Operations (FIFO - First In, First Out)
- Built using a circular queue to use memory efficiently
- Enqueue: add a number to the back of the queue
- Dequeue: remove a number from the front of the queue
- Peek: view the front number without removing it
- Automatically resizes when the queue becomes full
- Display the queue from front to rear

### 4. Linked List Operations
- Built using custom nodes where each node points to the next
- Insert: add a new node at the end of the list
- Delete: remove a node with a specific value and connect the list back
- Search: find a value and get its position in the list
- Display the full list in order

### 5. Searching Algorithms & Performance
- **Linear Search:** Checks each item one by one from start to end
- **Binary Search:** Quickly finds items by dividing a sorted list in half
  - Uses a sorted copy of the array so the original array order is not changed
- Counts the number of steps (comparisons) taken
- Measures execution time in nanoseconds

### 6. Graph Operations & Traversals
- Undirected graph built using an adjacency list
- Add vertices (nodes) with unique names
- Add edges (connections) between any two existing vertices
- Display the graph showing each vertex and its connected neighbors
- **Breadth-First Search (BFS):** Visits neighbors level by level using a queue
- **Depth-First Search (DFS):** Explores as deep as possible down each path using recursion
- Both BFS and DFS display the visit order, total steps, and time taken

### 7. Performance Comparison
- **Search Comparison:** Compares Linear Search vs Binary Search side by side to see which one took fewer steps and less time
- **Graph Comparison:** Compares BFS vs DFS side by side with steps and time taken
- **Complexity Summary:** Quick reference screen showing the theoretical Big-O time complexity for each operation

### 8. System Controller & Safe Input
- Interactive console menu to navigate through all operations
- **Display All Results:** Shows the current contents of the Array, Stack, Queue, Linked List, and Graph all in one screen
- **Safe Input Handling:** Checks user input so the program does not crash if a user enters letters instead of numbers or leaves an input empty

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
