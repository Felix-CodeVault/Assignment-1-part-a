import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    private Lecturer lecturer = new Lecturer();
    String expected, actual;
    LocalDate DOB = LocalDate.of(1994, 2, 24);

    @Test
    void getUsernameTest() {
        lecturer.setDetails("Steve", "Jobs", 50);
        String expected = "SteveJobs50";
        String actual = lecturer.getUsername();
        //assert that expected and actual are the same
        assertEquals(expected, actual);

    }


    @Test
    void getfName() {
        lecturer.setfName("Steve");
        expected = "Steve";
        actual = lecturer.getfName();
        assertEquals(expected, actual);
    }

    @Test
    void setfName() {
        lecturer.setfName("Steve");
        expected = "Steve";
        actual = lecturer.getfName();
        assertEquals(expected, actual);
    }

    @Test
    void getlName() {
        lecturer.setlName("Jobs");
        expected = "Jobs";
        actual = lecturer.getlName();
        assertEquals(expected, actual);
    }

    @Test
    void setlName() {
        lecturer.setlName("Jobs");
        expected = "Jobs";
        actual = lecturer.getlName();
        assertEquals(expected, actual);
    }

    @Test
    void getAge() {
        lecturer.setAge(50);
        int expected = 50;
        int actual = lecturer.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void setAge() {
        lecturer.setAge(50);
        int expected = 50;
        int actual = lecturer.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void getID() {
        lecturer.setID(123);
        int expected = 123;
        int actual = lecturer.getID();
        assertEquals(expected, actual);
    }

    @Test
    void setID() {
        lecturer.setID(123);
        int expected = 123;
        int actual = lecturer.getID();
        assertEquals(expected, actual);
    }

    @Test
    void getDOB() {
        lecturer.setDOB(DOB);
        LocalDate expected = DOB;
        LocalDate actual = lecturer.getDOB();
        assertEquals(expected, actual);
    }

    @Test
    void setDOB() {
        lecturer.setDOB(DOB);
        LocalDate expected = DOB;
        LocalDate actual = lecturer.getDOB();
        assertEquals(expected, actual);
    }
}