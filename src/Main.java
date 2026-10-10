import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataStructureGraphAnalyzer app = new DataStructureGraphAnalyzer(scanner);
        app.run();
        scanner.close();
    }
}
