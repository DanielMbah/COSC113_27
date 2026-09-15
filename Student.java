
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.FN = "Daniel";
        s1.LN = "Mbah";

        System.out.println(s1);
        System.out.println("First name is: " + s1.FN);
        System.out.println("Last name is: " + s1.LN);
        System.out.println("Hello Constructors");
    }
}

class Student {

    // Attributes
    String FN;
    String LN;
}

public class Main {

    public static void main(String[] args) {

        // Using the constructor
        Student s3 = new Student("Burkes", "Jayne", 111);

        System.out.println("First name is: " + s3.FN);
        System.out.println("Last name is: " + s3.LN);
        System.out.println("Student ID is: " + s3.SID);

        // If constructors are not defined JVM will provide a default constructor
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student();

        System.out.println("First name is: " + s2.FN);
        System.out.println("Last name is: " + s2.LN);
        System.out.println("Student ID is: " + s2.SID);

        // Use of dot operator (.)
    }
}

class Student {

    // Attributes
    String FN;
    String LN;
    int SID;

    // Constructor
    Student(String firstName, String lastName, int studentID) {
        FN = firstName;
        LN = lastName;
        SID = studentID;
    }

    // Default constructor
    Student() {
    }

    // toString method
    public String toString() {
        return "Student: " + FN + " " + LN + " " + SID;
    }
}

//method name - main
//JVM executes student.main
//JVM knows their is a class which contains the main method. Use classname.method name

//must have a static method. Must be main/area of strings.

//methods can be static and non static
//This method returns . - Return type is void
//return types can be - int, boolean, return val, string, char,
//Method_1 = main_1 has to be defined or same as the file name

//udent s1 = new Student();
//ew - it will create a new object
//the constuctor will assign default values to the constructor

//stem.out.println

// = first.name
//.operator. Must be used with reference. It follows a reference
//null, since the default contructor didn't assign any value


//incrementation
public class Student {

    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }
        System.out.print("outside loop");

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}



//loops and methods
public class Student {

    public static void main(String[] args) {

        Pattern_3();

    }

    public static void Print_Marker() {
        System.out.println();
    }

    public static void Pattern_3() {

        int j, k;

        // Outer loop
        for (j = 5; j >= 1; j--) {

            // Inner loop - repetition of integers
            for (k = 1; k <= j; k++) {
                System.out.print("_" + " ");
            }

            Print_Marker();
        }
    }
}
