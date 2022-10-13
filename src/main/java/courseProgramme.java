import org.joda.time.DateTime;

import java.util.ArrayList;

public class courseProgramme {
    private String name;
    private ArrayList<Module> modulesList = new ArrayList<>();
    private ArrayList<Student> studentsEnrolled = new ArrayList<>();
    private DateTime startDate, endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModulesList() {
        return modulesList;
    }

    public void setModulesList(Module module) {
        modulesList.add(module);
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(Student student) {
        studentsEnrolled.add(student);
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
