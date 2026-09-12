import java.util.Arrays;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int grades[];
    public Student(int studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades = grades;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public void print() {
        System.out.println("Student ID: " + getStudentID() + "\t" + "First Name: " + getFirstName() + "\t" + "Last Name: " + getLastName() + "\t" + "Email: " + getEmailAddress() + "\t" + "Age: " + getAge() + "\t" + "Grades: " + Arrays.toString(getGrades()));
    }
}
