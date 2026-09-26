public class Main {

    public static void main(String[] args) {

        // Course
        Course c1 = new Course();
        c1.display_course_information();

        // COSC113
        COSC113 section1 = new COSC113();
        section1.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new Course();

        cosc214.display_course_information();
        section2.display_course_information();

        // Student
        Student arturo = new Student();

        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;
        arturo.enrolled_courses[1] = frac;
        arturo.enrolled_courses[2] = cosc107;
        arturo.enrolled_courses[3] = eng102;
        arturo.enrolled_courses[4] = soc101;

        // BSU Members
        BSU_Member[] members = new BSU_Member[10];

        members[0] = new Student();
        members[1] = new Instructor();
        members[2] = new BSU_Member();

        members[3] = new Student(
                1001, "Daniel", 'M', 24, "Student", 3.5
        );

        members[4] = new Instructor(
                2001, "Instructor", 'M', 45, "Faculty", "Computer Science"
        );

        members[5] = new BSU_Member(
                3001, "John", 'M', 30, "Staff"
        );

        members[6] = new Student();
        members[7] = new Instructor();
        members[8] = new BSU_Member();
        members[9] = new Student();

        System.out.println("===========================================");

        for (int j = 0; j < 10; j++) {
            members[j].display_information();
        }

        System.out.println("===========================================");

        // Test Course setters/getters
        c1.setName("Object Oriented Programming");
        c1.setCourse_number(113);
        c1.setCredit(4);
        c1.Set_Classroom("Room 307");;

        System.out.println("Course Name: " + c1.getName());
        System.out.println("Course Number: " + c1.getCourse_number());
        System.out.println("Credits: " + c1.getCredit());
        System.out.println("Classroom: " + c1.get_Classroom());

        // Test Student getter/setter
        arturo.setGpa(3.5);
        System.out.println("Student GPA: " + arturo.getGpa());
    }
}