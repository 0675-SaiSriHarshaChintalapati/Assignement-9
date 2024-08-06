import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process the line.
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while processing the file: " + filePath);
                e.printStackTrace();
            }
        }
    }
}
