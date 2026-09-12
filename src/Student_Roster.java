import java.util.ArrayList;

public class Student_Roster {
    private ArrayList<Student> students;
    public Student_Roster() {
        students = new ArrayList<>();
    }
    public void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};
        int studentIDint = Integer.parseInt(studentID);
        students.add(new Student(studentIDint, firstName, lastName, emailAddress, age, grades));
    }
    public void remove(String studentID) {
        int studentIDint = Integer.parseInt(studentID);
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudentID() == studentIDint) {
                students.remove(i);
                return;
            }
        }
        System.out.println(studentID + " not found.");
    }
    public void print_all() {
        for (Student s : students) {
            s.print();
        }
    }
    public void print_average_grade(String studentID) {
        int studentIDint = Integer.parseInt(studentID);
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudentID() == studentIDint) {
                int[] grades = s.getGrades();
                int sum = 0;
                for (int g : grades) {
                    sum += g;
                }
                double avg = (double) sum / grades.length;
                System.out.println(avg);
                return;
            }
        }
    }
    public void print_invalid_emails() {
        for (Student s : students) {
            String email = s.getEmailAddress();
            if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
                System.out.println(email);
            }
        }
    }
};
