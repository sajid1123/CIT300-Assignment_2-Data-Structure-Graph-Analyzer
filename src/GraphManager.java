import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphManager {
    public static class TraversalResult {
        private final String algorithm;
        private final List<String> order;
        private final int steps;
        private final long executionTimeNs;

        public TraversalResult(String algorithm, List<String> order, int steps, long executionTimeNs) {
            this.algorithm = algorithm;
            this.order = order;
            this.steps = steps;
            this.executionTimeNs = executionTimeNs;
        }

        public String getAlgorithm() { return algorithm; }
        public List<String> getOrder() { return order; }
        public int getSteps() { return steps; }
        public long getExecutionTimeNs() { return executionTimeNs; }
    }

    private final Map<String, Set<String>> adjacencyList = new LinkedHashMap<>();

    public boolean addVertex(String vertex) {
        if (adjacencyList.containsKey(vertex)) return false;
        adjacencyList.put(vertex, new LinkedHashSet<>());
        return true;
    }

    public boolean addEdge(String from, String to) {
        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to)) return false;
        if (from.equals(to)) return false;
        boolean added = adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from); // undirected graph
        return added;
    }

    public boolean containsVertex(String vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean isEmpty() {
        return adjacencyList.isEmpty();
    }

    public void displayGraph() {
        if (adjacencyList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        System.out.println("Graph (Adjacency List):");
        for (Map.Entry<String, Set<String>> e : adjacencyList.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public String displayString() {
        if (adjacencyList.isEmpty()) return "{}";
        StringBuilder b = new StringBuilder();
        for (Map.Entry<String, Set<String>> e : adjacencyList.entrySet()) {
            b.append(e.getKey()).append(" -> ").append(e.getValue()).append(System.lineSeparator());
        }
        return b.toString().trim();
    }

    public TraversalResult bfs(String startVertex) {
        List<String> order = new ArrayList<>();
        Set<String> visited = new LinkedHashSet<>();
        Deque<String> queue = new ArrayDeque<>();
        int steps = 0;
        long start = System.nanoTime();
        visited.add(startVertex);
        queue.offer(startVertex);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            order.add(current);
            steps++;
            for (String neighbor : adjacencyList.get(current)) {
                steps++;
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        long end = System.nanoTime();
        return new TraversalResult("BFS", order, steps, end - start);
    }

    public TraversalResult dfs(String startVertex) {
        List<String> order = new ArrayList<>();
        Set<String> visited = new LinkedHashSet<>();
        int[] steps = {0};
        long start = System.nanoTime();
        dfsRecursive(startVertex, visited, order, steps);
        long end = System.nanoTime();
        return new TraversalResult("DFS", order, steps[0], end - start);
    }

    private void dfsRecursive(String current, Set<String> visited, List<String> order, int[] steps) {
        visited.add(current);
        order.add(current);
        steps[0]++;
        for (String neighbor : adjacencyList.get(current)) {
            steps[0]++;
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, order, steps);
            }
        }
    }

    public void printTraversalResult(TraversalResult result) {
        System.out.println("---------------------------------------------");
        System.out.println("Algorithm      : " + result.getAlgorithm());
        System.out.println("Traversal      : " + result.getOrder());
        System.out.println("Steps          : " + result.getSteps());
        System.out.println("Execution Time : " + result.getExecutionTimeNs() + " ns");
        System.out.println("---------------------------------------------");
    }
}
