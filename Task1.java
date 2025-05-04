import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        String user = "User";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        System.out.println("Hello, " + user + "!");
        System.out.println("Current time: " + timestamp);
    }
}
