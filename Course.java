public class Course {

    String name;
    int course_number;
    int credit;
    private String classroom;

    Course() {
        name = "";
        course_number = 0;
        credit = 0;
        classroom = "";
    }

    Course(int course_number, int credit, String name) {
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
        this.classroom = "";
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse_number(int course_number) {
        this.course_number = course_number;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void Set_Classroom(String classroom) {
        this.classroom = classroom;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getCourse_number() {
        return this.course_number;
    }

    public int getCredit() {
        return this.credit;
    }

    public String get_Classroom() {
        return this.classroom;
    }

    public void display_course_information() {
        System.out.println(
                "Course name: "
                        + this.name
                        + " Course number: "
                        + this.course_number
        );
    }
}
