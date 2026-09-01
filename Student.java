
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
