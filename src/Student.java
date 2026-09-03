//// https://github.com/DanielMbah
//public class StudentInfo {
//
//    // Attributes
//    String FN;   // First Name
//    String LN;   // Last Name
//    String Std;  // Student ID
//    double CGP;  // Cumulative GPA
//
//    public static void main(String[] args) {
//
//        // Declare two reference variables of type StudentInfo
//        StudentInfo student1;
//        StudentInfo student2;
//
//        // Create two StudentInfo objects and assign them to the reference variables
//        student1 = new StudentInfo();
//        student2 = new StudentInfo();
//
//        // Print the raw object references (e.g. StudentInfo@6ce253f1)
//        // This shows each object lives at its own location in memory
//        System.out.println("student1 reference: " + student1);
//        System.out.println("student2 reference: " + student2);
//        System.out.println();
//
//        // Assign values to student1
//        student1.FN = "Asi";
//        student1.LN = "Mbah";
//        student1.Std = "2218449";
//        student1.CGP = 3.46;
//
//        // Assign values to student2
//        student2.FN = "Connor";
//        student2.LN = "Douglas";
//        student2.Std = "8225691";
//        student2.CGP = 4.00;
//
//        // Print the values stored in the two reference variables
//        System.out.println("Student 1:");
//        System.out.println("First Name: " + student1.FN);
//        System.out.println("Last Name: " + student1.LN);
//        System.out.println("Student ID: " + student1.Std);
//        System.out.println("Cumulative GPA: " + student1.CGP);
//
//        System.out.println();
//
//        System.out.println("Student 2:");
//        System.out.println("First Name: " + student2.FN);
//        System.out.println("Last Name: " + student2.LN);
//        System.out.println("Student ID: " + student2.Std);
//        System.out.println("Cumulative GPA: " + student2.CGP);
//    }
//}

//Lab2 Assignment
// https://github.com/DanielMbah/COSC113_27

public class Student {

    // Attributes
    private String firstName;
    private String lastName;
    private String studentId;

    // Constructor 1: Default constructor (no arguments)
    // Chains to the one-argument constructor using this()
    // ---------------------------------------------------------
    public Student() {
        this("Unknown");
    }

    // Constructor 2: One argument (first name only)
    // Chains to the two-argument constructor using this()
    // ---------------------------------------------------------
    public Student(String firstName) {
        this(firstName, "Unknown");
    }

    // ---------------------------------------------------------
    // Constructor 3: Two arguments (first name, last name)
    // Chains to the three-argument constructor using this()
    // ---------------------------------------------------------
    public Student(String firstName, String lastName) {
        this(firstName, lastName, "N/A");
    }

    // ---------------------------------------------------------
    // Constructor 4: Three arguments (first name, last name, student ID)
    // This is the "master" constructor — it actually assigns the fields.
    // Every other constructor eventually chains down to this one.
    // ---------------------------------------------------------
    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    // ---------------------------------------------------------
    // Getters and Setters
    // ---------------------------------------------------------
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // ---------------------------------------------------------
    // Main method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        // Create Student objects using each of the four constructors
        Student student1 = new Student();                                  // default constructor
        Student student2 = new Student("Asi");                             // one-arg constructor
        Student student3 = new Student("Craig,Douglas");          // two-arg constructor
        Student student4 = new Student("Joan,Fel", "8225691");          // three-arg constructor

        // Use the dot operator with getter methods to print each student's info
        System.out.println("Student 1 (default constructor):");
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println();

        System.out.println("Student 2 (one-arg constructor):");
        System.out.println("First Name: " + student2.getFirstName());
        System.out.println("Last Name: " + student2.getLastName());
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println();

        System.out.println("Student 3 (two-arg constructor):");
        System.out.println("First Name: " + student3.getFirstName());
        System.out.println("Last Name: " + student3.getLastName());
        System.out.println("Student ID: " + student3.getStudentId());
        System.out.println();

        System.out.println("Student 4 (three-arg constructor):");
        System.out.println("First Name: " + student4.getFirstName());
        System.out.println("Last Name: " + student4.getLastName());
        System.out.println("Student ID: " + student4.getStudentId());
        System.out.println();

        // Demonstrate the setter methods by updating student1's info
        System.out.println("Updating Student 1 using setters...");
        student1.setFirstName("Asi");
        student1.setLastName("Mbah");
        student1.setStudentId("2218449");

        System.out.println("Student 1 (after using setters):");
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Student ID: " + student1.getStudentId());
    }
}