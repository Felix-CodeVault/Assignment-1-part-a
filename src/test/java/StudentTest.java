import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student = new Student();

    @Test
    void getUsernameTest() {
        student.setDetails("Steve", "Jobs", 50);
        String expected = "SteveJobs50";
        String actual = student.getUsername();
        //assert that expected and actual are the same
        assertEquals(expected, actual);

    }
}