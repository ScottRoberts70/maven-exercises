import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StudentTest {
    private Student stud;

    @Before
    public void setUp() {
        this.stud = new Student(1, "Scott Roberts");
    }

    @Test
    public void testStudentCOnstructor() {
        assertEquals(1, stud.getId());
        assertEquals("Scott Roberts", stud.getName());
        assertTrue(stud.getGrades().isEmpty());
    }

    @Test
    public void testGetIdMethod() {
        assertEquals(1,stud.getId());
        Student newStudent = new Student(24, "Scott the Speedy");
        assertEquals(24, newStudent.getId());
    }

    @Test
    public void testGetNameMethod() {
        assertEquals("Scott Roberts", stud.getName());
        StudentTest stud2 = new Student (2, "Mike Friend");
        assertEquals("Mike Friend", ((Student) stud2).getName());
    }

    @Test
    public void testGradeMehtod() {
        stud.addGrade(88);
        assertEquals(1, stud.getGrades().size());
        stud.addGrade(94);
        assertEquals(2, stud.getGrades().size());
    }

    @Test
    public void testGetGradesMethod( ) {
        assertTrue(stud.getGrades().isEmpty());
        List<Integer> gradesToAdd = new ArrayList<>(Arrays.asList(100,99,94));
        for (int grade : gradesToAdd) {
            stud.addGrade(grade);
        }
        for (int i = 0; i <stud.getGrades.size(); i++){
            assertEquals(stud.getGrades().get(i)== gradesToAdd.get(i));
        }
    }
    @Test
    public void testGetGradeAverageMethod(){
        List<Integer> gradesToADD = new ArrayList<>(Arrays.asList(100, 80, 90));
        for (int grade : gradesToAdd)
    }

}
