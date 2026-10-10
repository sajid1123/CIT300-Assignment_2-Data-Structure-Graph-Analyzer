import java.util.Arrays;
import java.util.Scanner;

public class DataStructureGraphAnalyzer {
    private final Scanner scanner;
    private final ArrayManager arrayManager = new ArrayManager();
    private final StackManager stackManager = new StackManager();
    private final QueueManager queueManager = new QueueManager();
    private final LinkedListManager linkedListManager = new LinkedListManager();
    private final SearchAnalyzer searchAnalyzer = new SearchAnalyzer();
    private final GraphManager graphManager = new GraphManager();
    private final PerformanceAnalyzer performanceAnalyzer = new PerformanceAnalyzer();

    public DataStructureGraphAnalyzer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> linkedListMenu();
                case 5 -> searchingMenu();
                case 6 -> graphMenu();
                case 7 -> performanceMenu();
                case 8 -> displayAllResults();
                case 9 -> {
                    running = false;
                    System.out.println("Program ended. Thank you.");
                }
                default -> System.out.println("Invalid menu choice. Please select 1 to 9.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println();
        System.out.println("=============================================");
        System.out.println(" DATA STRUCTURE & GRAPH PERFORMANCE ANALYZER");
        System.out.println("=============================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("=============================================");
    }

    private void arrayMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- ARRAY OPERATIONS ---------------");
            System.out.println("1. Insert\n2. Delete\n3. Search\n4. Display\n5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> arrayManager.insert(InputHelper.readInt(scanner, "Enter value to insert: "));
                case 2 -> {
                    int value = InputHelper.readInt(scanner, "Enter value to delete: ");
                    System.out.println(arrayManager.delete(value) ? value + " deleted from the array." : "Value not found in the array.");
                }
                case 3 -> {
                    int value = InputHelper.readInt(scanner, "Enter value to search: ");
                    int index = arrayManager.search(value);
                    System.out.println(index >= 0 ? "Value found at index " + index + "." : "Value not found.");
                }
                case 4 -> arrayManager.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }

    private void stackMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- STACK OPERATIONS ---------------");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> stackManager.push(InputHelper.readInt(scanner, "Enter value to push: "));
                case 2 -> {
                    Integer value = stackManager.pop();
                    System.out.println(value == null ? "Cannot pop. Stack is empty." : "Popped value: " + value);
                }
                case 3 -> {
                    Integer value = stackManager.peek();
                    System.out.println(value == null ? "Stack is empty." : "Top value: " + value);
                }
                case 4 -> stackManager.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }

    private void queueMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- QUEUE OPERATIONS ---------------");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek / Front\n4. Display\n5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> queueManager.enqueue(InputHelper.readInt(scanner, "Enter value to enqueue: "));
                case 2 -> {
                    Integer value = queueManager.dequeue();
                    System.out.println(value == null ? "Cannot dequeue. Queue is empty." : "Dequeued value: " + value);
                }
                case 3 -> {
                    Integer value = queueManager.peek();
                    System.out.println(value == null ? "Queue is empty." : "Front value: " + value);
                }
                case 4 -> queueManager.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }

    private void linkedListMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n------------ LINKED LIST OPERATIONS ------------");
            System.out.println("1. Insert\n2. Delete\n3. Search\n4. Display\n5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> linkedListManager.insert(InputHelper.readInt(scanner, "Enter value to insert: "));
                case 2 -> {
                    int value = InputHelper.readInt(scanner, "Enter value to delete: ");
                    System.out.println(linkedListManager.delete(value) ? value + " deleted from the linked list." : "Value not found in the linked list.");
                }
                case 3 -> {
                    int value = InputHelper.readInt(scanner, "Enter value to search: ");
                    int position = linkedListManager.search(value);
                    System.out.println(position >= 0 ? "Value found at position " + position + "." : "Value not found.");
                }
                case 4 -> linkedListManager.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }

    private void searchingMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n------------- SEARCHING OPERATIONS -------------");
            System.out.println("Search data source: current Array values");
            System.out.println("1. Linear Search\n2. Binary Search\n3. Compare Linear and Binary Search\n4. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            if (choice >= 1 && choice <= 3 && arrayManager.size() == 0) {
                System.out.println("Array is empty. Add values in Array Operations first.");
                continue;
            }
            switch (choice) {
                case 1 -> runLinearSearch();
                case 2 -> runBinarySearch();
                case 3 -> compareSearches();
                case 4 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }
    }

    private void runLinearSearch() {
        int target = InputHelper.readInt(scanner, "Enter target value: ");
        searchAnalyzer.printResult(searchAnalyzer.linearSearch(arrayManager.toArray(), target));
    }

    private void runBinarySearch() {
        int target = InputHelper.readInt(scanner, "Enter target value: ");
        int[] data = arrayManager.toArray();
        System.out.println("Sorted data used for Binary Search: " + Arrays.toString(searchAnalyzer.sortedCopy(data)));
        searchAnalyzer.printResult(searchAnalyzer.binarySearch(data, target));
    }

    private void compareSearches() {
        int target = InputHelper.readInt(scanner, "Enter target value: ");
        int[] data = arrayManager.toArray();
        performanceAnalyzer.printSearchComparison(
                searchAnalyzer.linearSearch(data, target),
                searchAnalyzer.binarySearch(data, target));
    }

    private void graphMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- GRAPH OPERATIONS ---------------");
            System.out.println("1. Add Vertex\n2. Add Edge\n3. Display Graph\n4. BFS Traversal\n5. DFS Traversal\n6. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    String vertex = InputHelper.readNonEmptyText(scanner, "Enter vertex name: ");
                    System.out.println(graphManager.addVertex(vertex) ? "Vertex added successfully." : "Vertex already exists.");
                }
                case 2 -> addGraphEdge();
                case 3 -> graphManager.displayGraph();
                case 4 -> runBfs();
                case 5 -> runDfs();
                case 6 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 6.");
            }
        }
    }

    private void addGraphEdge() {
        if (graphManager.isEmpty()) {
            System.out.println("Graph is empty. Add vertices first.");
            return;
        }
        String from = InputHelper.readNonEmptyText(scanner, "Enter first vertex: ");
        String to = InputHelper.readNonEmptyText(scanner, "Enter second vertex: ");
        if (!graphManager.containsVertex(from) || !graphManager.containsVertex(to)) {
            System.out.println("Both vertices must exist before adding an edge.");
            return;
        }
        System.out.println(graphManager.addEdge(from, to) ? "Edge added successfully." : "Edge could not be added. It may already exist or be invalid.");
    }

    private void runBfs() {
        if (graphManager.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        String start = InputHelper.readNonEmptyText(scanner, "Enter starting vertex: ");
        if (!graphManager.containsVertex(start)) {
            System.out.println("Starting vertex does not exist.");
            return;
        }
        graphManager.printTraversalResult(graphManager.bfs(start));
    }

    private void runDfs() {
        if (graphManager.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        String start = InputHelper.readNonEmptyText(scanner, "Enter starting vertex: ");
        if (!graphManager.containsVertex(start)) {
            System.out.println("Starting vertex does not exist.");
            return;
        }
        graphManager.printTraversalResult(graphManager.dfs(start));
    }

    private void performanceMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n----------- PERFORMANCE COMPARISON ------------");
            System.out.println("1. Compare Linear Search vs Binary Search\n2. Compare BFS vs DFS\n3. Display Complexity Summary\n4. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    if (arrayManager.size() == 0) System.out.println("Array is empty. Add values first.");
                    else compareSearches();
                }
                case 2 -> compareGraphTraversals();
                case 3 -> performanceAnalyzer.printComplexitySummary();
                case 4 -> back = true;
                default -> System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }
    }

    private void compareGraphTraversals() {
        if (graphManager.isEmpty()) {
            System.out.println("Graph is empty. Add vertices and edges first.");
            return;
        }
        String start = InputHelper.readNonEmptyText(scanner, "Enter starting vertex: ");
        if (!graphManager.containsVertex(start)) {
            System.out.println("Starting vertex does not exist.");
            return;
        }
        performanceAnalyzer.printGraphComparison(graphManager.bfs(start), graphManager.dfs(start));
    }

    private void displayAllResults() {
        System.out.println("\n=============================================");
        System.out.println("               ALL CURRENT RESULTS");
        System.out.println("=============================================");
        System.out.println("Array       : " + arrayManager.displayString());
        System.out.println("Stack       : " + stackManager.displayString());
        System.out.println("Queue       : " + queueManager.displayString());
        System.out.println("Linked List : " + linkedListManager.displayString());
        System.out.println("\nGraph:");
        System.out.println(graphManager.displayString());
        System.out.println("=============================================");
    }
}
