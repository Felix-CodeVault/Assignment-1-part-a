public class Module {
    private String moduleName;
    private int ID;
    private Student[] studentList;
    private courseProgramme[] coursesAssociated;
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

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public courseProgramme[] getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(courseProgramme[] coursesAssociated) {
        this.coursesAssociated = coursesAssociated;
    }

    public Lecturer getLecturerAssociated() {
        return lecturerAssociated;
    }

    public void setLecturerAssociated(Lecturer lecturerAssociated) {
        this.lecturerAssociated = lecturerAssociated;
    }
}
