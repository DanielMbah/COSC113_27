// https://github.com/DanielMbah
public class StudentInfo {

    // Attributes
    String FN;   // First Name
    String LN;   // Last Name
    String Std;  // Student ID
    double CGP;  // Cumulative GPA

    public static void main(String[] args) {

        // Declare two reference variables of type StudentInfo
        StudentInfo student1;
        StudentInfo student2;

        // Create two StudentInfo objects and assign them to the reference variables
        student1 = new StudentInfo();
        student2 = new StudentInfo();

        // Print the raw object references (e.g. StudentInfo@6ce253f1)
        // This shows each object lives at its own location in memory
        System.out.println("student1 reference: " + student1);
        System.out.println("student2 reference: " + student2);
        System.out.println();

        // Assign values to student1
        student1.FN = "Asi";
        student1.LN = "Mbah";
        student1.Std = "2218449";
        student1.CGP = 3.46;

        // Assign values to student2
        student2.FN = "Connor";
        student2.LN = "Douglas";
        student2.Std = "8225691";
        student2.CGP = 4.00;

        // Print the values stored in the two reference variables
        System.out.println("Student 1:");
        System.out.println("First Name: " + student1.FN);
        System.out.println("Last Name: " + student1.LN);
        System.out.println("Student ID: " + student1.Std);
        System.out.println("Cumulative GPA: " + student1.CGP);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("First Name: " + student2.FN);
        System.out.println("Last Name: " + student2.LN);
        System.out.println("Student ID: " + student2.Std);
        System.out.println("Cumulative GPA: " + student2.CGP);
    }
}