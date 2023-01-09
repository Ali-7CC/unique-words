import Solution.Text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/example.txt");
        String exampleText = Files.readString(path);
        Text exampleTextObj = new Text(exampleText);
        System.out.println(exampleTextObj.getCounts());
    }
}
