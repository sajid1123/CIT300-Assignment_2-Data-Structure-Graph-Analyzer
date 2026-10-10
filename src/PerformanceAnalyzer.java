public class PerformanceAnalyzer {
    public void printSearchComparison(SearchAnalyzer.SearchResult linear,
                                      SearchAnalyzer.SearchResult binary) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("          SEARCH PERFORMANCE COMPARISON");
        System.out.println("=============================================");
        System.out.printf("%-18s %-10s %-18s%n", "Algorithm", "Steps", "Time (ns)");
        System.out.println("---------------------------------------------");
        System.out.printf("%-18s %-10d %-18d%n", linear.getAlgorithm(), linear.getSteps(), linear.getExecutionTimeNs());
        System.out.printf("%-18s %-10d %-18d%n", binary.getAlgorithm(), binary.getSteps(), binary.getExecutionTimeNs());
        System.out.println("---------------------------------------------");
        System.out.println("Linear Search complexity : O(n)");
        System.out.println("Binary Search complexity : O(log n)");
        System.out.println("Binary Search requires sorted data.");
        System.out.println("Execution time may vary between runs.");
        System.out.println("=============================================");
    }

    public void printGraphComparison(GraphManager.TraversalResult bfs,
                                     GraphManager.TraversalResult dfs) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("          GRAPH PERFORMANCE COMPARISON");
        System.out.println("=============================================");
        System.out.printf("%-12s %-10s %-18s%n", "Algorithm", "Steps", "Time (ns)");
        System.out.println("---------------------------------------------");
        System.out.printf("%-12s %-10d %-18d%n", bfs.getAlgorithm(), bfs.getSteps(), bfs.getExecutionTimeNs());
        System.out.printf("%-12s %-10d %-18d%n", dfs.getAlgorithm(), dfs.getSteps(), dfs.getExecutionTimeNs());
        System.out.println("---------------------------------------------");
        System.out.println("BFS complexity : O(V + E)");
        System.out.println("DFS complexity : O(V + E)");
        System.out.println("BFS explores level by level using a queue.");
        System.out.println("DFS explores deeply before backtracking.");
        System.out.println("Execution time may vary between runs.");
        System.out.println("=============================================");
    }

    public void printComplexitySummary() {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("             COMPLEXITY SUMMARY");
        System.out.println("=============================================");
        System.out.println("Array Search       : O(n)");
        System.out.println("Stack Push/Pop     : O(1)");
        System.out.println("Queue Enq/Deq      : O(1)");
        System.out.println("Linked List Search : O(n)");
        System.out.println("Linear Search      : O(n)");
        System.out.println("Binary Search      : O(log n)");
        System.out.println("BFS Traversal      : O(V + E)");
        System.out.println("DFS Traversal      : O(V + E)");
        System.out.println("=============================================");
    }
}
