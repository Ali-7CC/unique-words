import static org.junit.jupiter.api.Assertions.assertEquals;
import Solution.Text;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class TextTest {
    @Test
    public void  constructorTest() {
        Text text = new Text("Hello world hello");
        Map<String, Integer>  expected = Map.of("hello", 2, "world", 1);
        Map<String, Integer>  actual = text.getCounts();
        assertEquals(expected, actual);
    }

    @Test
    public void setTextTest() {
        Text text = new Text("Hello world hello");
        text.setText("Hello this is a new text that that I'm setting hello this");
        Map<String, Integer>  expected = Map.of("hello", 4, "world", 1, "this", 2, "is", 1, "a", 1, "new", 1, "text", 1, "that",2, "i'm", 1, "setting", 1);
        Map<String, Integer>  actual = text.getCounts();
        assertEquals(expected, actual);
    }

    @Test
    public void emptyTextTest() {
        Text text = new Text("");
        Map<String, Integer>  expected = new HashMap<>();
        Map<String, Integer>  actual = text.getCounts();
        assertEquals(expected, actual);
    }

    @Test
    public void nullTextTest() {
        Text text = new Text(null);
        Map<String, Integer>  expected = new HashMap<>();
        Map<String, Integer>  actual = text.getCounts();
        assertEquals(expected, actual);
    }
}