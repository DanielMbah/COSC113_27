// https://github.com/DanielMbah/COSC113_27

public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();

        // Inherited attributes from Person
        instructor.firstName = "Asi";
        instructor.lastName = "Mbah";
        instructor.personId = "2218449";

        // Instructor's own attributes
        instructor.department = "Computer Science";
        instructor.course = "COSC 113";

        // Print all attributes
        System.out.println("First Name: " + instructor.firstName);
        System.out.println("Last Name: " + instructor.lastName);
        System.out.println("Person ID: " + instructor.personId);
        System.out.println("Department: " + instructor.department);
        System.out.println("Course: " + instructor.course);
    }
}