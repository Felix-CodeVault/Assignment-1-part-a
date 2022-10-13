import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    Module module = new Module();
    String moduleName = "CT417";
    String expected, actual;
    int ID = 123;

    @Test
    void getModuleName() {
        module.setModuleName(moduleName);
        expected = "CT417";
        actual = module.getModuleName();
        assertEquals(expected, actual);
    }

    @Test
    void setModuleName() {
        module.setModuleName(moduleName);
        expected = "CT417";
        actual = module.getModuleName();
        assertEquals(expected, actual);
    }

    @Test
    void getID() {
        module.setID(ID);
        int expected = 123;
        int actual = module.getID();
        assertEquals(expected, actual);
    }

    @Test
    void setID() {
        module.setID(ID);
        int expected = 123;
        int actual = module.getID();
        assertEquals(expected, actual);
    }

    @Test
    void getStudentList() {
        Student student = new Student();
        module.addStudentToList(student);
        Student expected = student;
        Student actual = module.getStudentList().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void setStudentList() {
        Student student = new Student();
        module.addStudentToList(student);
        Student expected = student;
        Student actual = module.getStudentList().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void getCoursesAssociated() {
        courseProgramme course = new courseProgramme();
        module.addAssociatedCourses(course);
        courseProgramme expected = course;
        courseProgramme actual = module.getCoursesAssociated().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void setCoursesAssociated() {
        courseProgramme course = new courseProgramme();
        module.addAssociatedCourses(course);
        courseProgramme expected = course;
        courseProgramme actual = module.getCoursesAssociated().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void getLecturerAssociated() {
        Lecturer lecturer = new Lecturer();
        module.setLecturerAssociated(lecturer);
        Lecturer expected = lecturer;
        Lecturer actual = module.getLecturerAssociated();
        assertEquals(expected, actual);
    }

    @Test
    void setLecturerAssociated() {
        Lecturer lecturer = new Lecturer();
        module.setLecturerAssociated(lecturer);
        Lecturer expected = lecturer;
        Lecturer actual = module.getLecturerAssociated();
        assertEquals(expected, actual);
    }
}