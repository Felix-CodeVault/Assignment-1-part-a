import java.util.ArrayList;

public class Module {
    private String moduleName;
    private int ID;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<courseProgramme> coursesAssociated = new ArrayList<>();
    private Lecturer lecturerAssociated;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToList(Student student) {
        studentList.add(student);
    }

    public ArrayList<courseProgramme> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void addAssociatedCourses (courseProgramme course) {
        coursesAssociated.add(course);
    }

    public Lecturer getLecturerAssociated() {
        return lecturerAssociated;
    }

    public void setLecturerAssociated(Lecturer lecturerAssociated) {
        this.lecturerAssociated = lecturerAssociated;
    }
}
