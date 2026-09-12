public class Student_Main {
    public static void main(String[] args) {
        String[] students = {"1,John,Smith,JohnSmith1989@gmail.com,20,88,79,59", "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85", "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87", "4,Erin,Black,Erin.black@comcast.net,22,91,98,82", "5,Parker,Maziarz,pmazia2@wgu.edu,23,90,87,95"
        };
        Student_Roster roster = new Student_Roster();
        for (String entry : students) {
            String[] parts = entry.split(",");
            roster.add(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7]));
        }
        roster.print_all();
        roster.print_invalid_emails();
        for (String entry : students) {
            String[] parts = entry.split(",");
            roster.print_average_grade(parts[0]);
        }
        roster.remove("3");
        roster.remove("3");
    }
}
