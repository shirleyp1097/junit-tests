import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StudentTest {
    Student myStudent;

    @Before
    public void setUp() {
        myStudent = new Student("Todd", 123);
    }

    @Test
    public void testGetId() {
        long id = 123;
        assertEquals(myStudent.getId(), id);
    }

    @Test
    public void testGetName() {

    }

//    @Test
//    public void testIfStringEquals() {
//        String codeup = "CodeUp";
//        assertEquals(codeup, "CodeUp");
//    }
//
//    @Test
//    public void testArrayList() {
//        List<String> languages = new ArrayList<>();
//        List<String> moreLanguages = new ArrayList<>();
//        assertNotSame(languages, moreLanguages);
//    }
//
//    @Test
//    public void testArray() {
//        int[] numbers = {1, 2, 3};
//        int[] otherNumbers = new int[3];
//        otherNumbers[0] = 1;
//        otherNumbers[1] = 2;
//        otherNumbers[2] = 3;
//        assertArrayEquals(numbers, otherNumbers);
//    }
//
//    @Test
//    public void testStringContains() {
//        String language = "PHP";
//        assertTrue(language.contains("H")); // use assertTrue for this statement
//        assertFalse(language.contains("J")); // use assertFalse for this statement
//    }
//
//

}
