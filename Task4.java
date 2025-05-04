import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String path = "Java oops concept.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            System.out.println("Reading file: " + path);
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

