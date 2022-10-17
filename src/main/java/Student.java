import java.time.LocalDate;
import java.util.ArrayList;

public class Student {


    private String fName, lName, username = getUsername();
    private int age, ID;
    private LocalDate DOB;

    private ArrayList<Module> registeredModules = new ArrayList<>();

    private ArrayList<courseProgramme> registeredCourse = new ArrayList<>();

    public String getUsername(){
        return fName + lName + age;
    }

    public void setDetails(String fName, String lName, int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public ArrayList<Module> getRegisteredModules() {
        return registeredModules;
    }

    public void addModule(Module module){
        registeredModules.add(module);
    }


    public ArrayList<courseProgramme> getRegisteredCourse(){
        return registeredCourse;
    }

    public void addCourse(courseProgramme course){
        registeredCourse.add(course);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }



}
