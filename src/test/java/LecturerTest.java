import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    private Lecturer lecturer = new Lecturer();

    @Test
    void getUsernameTest() {
        lecturer.setDetails("Steve", "Jobs", 50);
        String expected = "SteveJobs50";
        String actual = lecturer.getUsername();
        //assert that expected and actual are the same
        assertEquals(expected, actual);

    }
}