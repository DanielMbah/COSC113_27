public class COSC113 {
    public void display_course_information() {
    }

    public class cosc113 extends Course {

        String syllabus;
        String coding_language;
        Instructor i1;
        Student[] students;

        cosc113() {
            this.syllabus = "Java";
            this.coding_language = "Java";
            this.i1 = null;
            this.students = null;
            this.course_number = 113;
            this.credit = 4;
            this.name = "COSC113";
        }

        cosc113(int course_number, int credit, String name) {
            super(course_number, credit, name);
            this.syllabus = "Java";
            this.coding_language = "Java";
            this.i1 = null;
            this.students = null;
        }

        // Getters
        public String getSyllabus() {
            return this.syllabus;
        }

        public String getCoding_language() {
            return this.coding_language;
        }

        public Instructor getI1() {
            return this.i1;
        }

        public Student[] getStudents() {
            return this.students;
        }

        // Setters
        public void setSyllabus(String syllabus) {
            this.syllabus = syllabus;
        }

        public void setCoding_language(String coding_language) {
            this.coding_language = coding_language;
        }

        public void setI1(Instructor i1) {
            this.i1 = i1;
        }

        public void setStudents(Student[] students) {
            this.students = students;
        }

        @Override
        public void display_course_information() {
            System.out.println(
                    "Course name: "
                            + super.name
                            + " Course number: "
                            + super.course_number
            );

            System.out.println(
                    "Syllabus: "
                            + this.syllabus
                            + " Language: "
                            + this.coding_language
                            + " Instructor: "
                            + this.i1
                            + " Students: "
                            + this.students
            );
        }
    }
}
