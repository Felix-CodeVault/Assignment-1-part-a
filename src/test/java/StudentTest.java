import org.junit.jupiter.api.Test;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student = new Student();
    String expected, actual;
    LocalDate DOB = LocalDate.of(1994, 2, 24);




    @Test
    void getUsernameTest() {
        student.setDetails("Steve", "Jobs", 50);
        expected = "SteveJobs50";
        actual = student.getUsername();
        //assert that expected and actual are the same
        assertEquals(expected, actual);

    }


    @Test
    void getfName() {
        student.setfName("Steve");
        expected = "Steve";
        actual = student.getfName();
        assertEquals(expected, actual);
    }

    @Test
    void setfName() {
        student.setfName("Steve");
        expected = "Steve";
        actual = student.getfName();
        assertEquals(expected, actual);
    }

    @Test
    void getlName() {
        student.setlName("Jobs");
        expected = "Jobs";
        actual = student.getlName();
        assertEquals(expected, actual);
    }

    @Test
    void setlName() {
        student.setlName("Jobs");
        expected = "Jobs";
        actual = student.getlName();
        assertEquals(expected, actual);
    }


    @Test
    void getAge() {
        student.setAge(50);
        int expected = 50;
        int actual = student.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void setAge() {
        student.setAge(50);
        int expected = 50;
        int actual = student.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void getID() {
        student.setID(123);
        int expected = 123;
        int actual = student.getID();
        assertEquals(expected, actual);
    }

    @Test
    void setID() {
        student.setID(123);
        int expected = 123;
        int actual = student.getID();
        assertEquals(expected, actual);

    }

    @Test
    void getDOB() {
        student.setDOB(DOB);
        LocalDate expected = DOB;
        LocalDate actual = student.getDOB();
        assertEquals(expected, actual);
    }

    @Test
    void setDOB() {
        student.setDOB(DOB);
        LocalDate expected = DOB;
        LocalDate actual = student.getDOB();
        assertEquals(expected, actual);
    }
}