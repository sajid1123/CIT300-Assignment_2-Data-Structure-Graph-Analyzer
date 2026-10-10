import java.util.Arrays;

public class SearchAnalyzer {
    public static class SearchResult {
        private final String algorithm;
        private final int target;
        private final int index;
        private final int steps;
        private final long executionTimeNs;

        public SearchResult(String algorithm, int target, int index, int steps, long executionTimeNs) {
            this.algorithm = algorithm;
            this.target = target;
            this.index = index;
            this.steps = steps;
            this.executionTimeNs = executionTimeNs;
        }

        public String getAlgorithm() { return algorithm; }
        public int getTarget() { return target; }
        public int getIndex() { return index; }
        public int getSteps() { return steps; }
        public long getExecutionTimeNs() { return executionTimeNs; }
        public boolean isFound() { return index >= 0; }
    }

    public SearchResult linearSearch(int[] data, int target) {
        int steps = 0;
        int index = -1;
        long start = System.nanoTime();
        for (int i = 0; i < data.length; i++) {
            steps++;
            if (data[i] == target) {
                index = i;
                break;
            }
        }
        long end = System.nanoTime();
        return new SearchResult("Linear Search", target, index, steps, end - start);
    }

    public SearchResult binarySearch(int[] data, int target) {
        int[] sorted = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted); // sorting is prepared before timing the actual binary search
        int low = 0;
        int high = sorted.length - 1;
        int index = -1;
        int steps = 0;
        long start = System.nanoTime();
        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;
            if (sorted[mid] == target) {
                index = mid;
                break;
            }
            if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        long end = System.nanoTime();
        return new SearchResult("Binary Search", target, index, steps, end - start);
    }

    public int[] sortedCopy(int[] data) {
        int[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy;
    }

    public void printResult(SearchResult result) {
        System.out.println("---------------------------------------------");
        System.out.println("Algorithm      : " + result.getAlgorithm());
        System.out.println("Target         : " + result.getTarget());
        System.out.println("Found          : " + (result.isFound() ? "Yes" : "No"));
        System.out.println("Index          : " + (result.isFound() ? result.getIndex() : "N/A"));
        System.out.println("Steps          : " + result.getSteps());
        System.out.println("Execution Time : " + result.getExecutionTimeNs() + " ns");
        System.out.println("---------------------------------------------");
    }
}
