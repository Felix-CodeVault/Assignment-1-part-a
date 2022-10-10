import org.joda.time.DateTime;

public class courseProgramme {
    private String name;
    private Module[] modulesList;
    private Student[] studentsEnrolled;
    private DateTime startDate, endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getModulesList() {
        return modulesList;
    }

    public void setModulesList(Module[] modulesList) {
        this.modulesList = modulesList;
    }

    public Student[] getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(Student[] studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
