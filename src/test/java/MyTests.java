import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class MyTests {

    @Test
    public void firstTest(){
        String expected = "Codeup";
        String actual = "Codeup";
        assertEquals(expected , actual);
    }
    @Test
    public void secondTest(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void thirdTest(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }
    @Test
    public void fourthTest(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}











