import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.Test;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void snippetTest1() throws IOException {
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
        List<String> actual = MarkdownParse.getLinks("snippetTest1.md");
        assertEquals(expected, actual);
    }
    @Test
    public void snippetTest2() throws IOException {
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        List<String> actual = MarkdownParse.getLinks("snippetTest2.md");
        assertEquals(expected, actual);
    }
    @Test
    public void snippetTest3() throws IOException {
        List<String> expected = List.of( "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        List<String> actual = MarkdownParse.getLinks("snippetTest3.md");
        assertEquals(expected, actual);
    }


}