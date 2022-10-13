import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class courseProgrammeTest {
    String courseName = "CS&IT";
    courseProgramme course = new courseProgramme();
    DateTime startDate = DateTime.now();
    DateTime endDate = DateTime.now();

    @Test
    void getName() {
        course.setName(courseName);
        String expected = "CS&IT";
        String actual = course.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setName() {
        course.setName(courseName);
        String expected = "CS&IT";
        String actual = course.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getModulesList() {
        Module module = new Module();
        course.setModulesList(module);
        Module expected = course.getModulesList().get(0);
        Module actual = module;
        assertEquals(expected, actual);

    }

    @Test
    void setModulesList() {
        Module module = new Module();
        course.setModulesList(module);
        Module expected = course.getModulesList().get(0);
        Module actual = module;
        assertEquals(expected, actual);
    }

    @Test
    void getStudentsEnrolled() {
        Student student = new Student();
        course.setStudentsEnrolled(student);
        Student expected = course.getStudentsEnrolled().get(0);
        Student actual = student;
        assertEquals(expected, actual);
    }

    @Test
    void setStudentsEnrolled() {
        Student student = new Student();
        course.setStudentsEnrolled(student);
        Student expected = course.getStudentsEnrolled().get(0);
        Student actual = student;
        assertEquals(expected, actual);
    }

    @Test
    void getStartDate() {
        course.setStartDate(startDate);
        DateTime expected = startDate;
        DateTime actual = course.getStartDate();
        assertEquals(expected, actual);
    }

    @Test
    void setStartDate() {
        course.setStartDate(startDate);
        DateTime expected = startDate;
        DateTime actual = course.getStartDate();
        assertEquals(expected, actual);
    }

    @Test
    void getEndDate() {
        course.setEndDate(endDate);
        DateTime expected = startDate;
        DateTime actual = course.getEndDate();
        assertEquals(expected, actual);
    }

    @Test
    void setEndDate() {
        course.setEndDate(endDate);
        DateTime expected = startDate;
        DateTime actual = course.getEndDate();
        assertEquals(expected, actual);
    }
}