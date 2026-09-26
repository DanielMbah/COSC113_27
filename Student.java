public class Student extends BSU_Member {

    double gpa;
    Course[] enrolled_courses;

    Student() {
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    Student(int id, String name, char gender, int age,
            String status, double gpa) {
        super(id, name, gender, age, status);
        this.gpa = gpa;
        this.enrolled_courses = new Course[6];
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Course[] get_Enrolled_Courses() {
        return this.enrolled_courses;
    }

    public void set_Enrolled_Courses(Course[] enrolled_courses) {
        this.enrolled_courses = enrolled_courses;
    }

    @Override
    public void display_information() {
        System.out.println("Inside Student ------ Status: " + status);
    }
}