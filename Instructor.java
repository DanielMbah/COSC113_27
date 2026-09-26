public class Instructor extends BSU_Member {

    String department;

    Instructor() {
        this.department = "CS";
        this.status = "Faculty";
    }

    Instructor(int id, String name, char gender, int age,
               String status, String department) {
        super(id, name, gender, age, status);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display_information() {
        System.out.println(
                "Inside Instructor-------Department: "
                        + this.department
                        + " Faculty: "
                        + this.status
        );
    }
}