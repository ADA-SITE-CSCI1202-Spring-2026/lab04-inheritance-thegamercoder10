import java.util.Arrays;

public class PhdStudent extends Student {
    private String department, courses[];

    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return this.department;
    }

    public String[] getCourses() {
        return this.courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String courseList = "";
        for (String course : courses) {
            courseList += course + ", ";
        }
        return super.toString() + " - Department: " + department + " - Courses: " + courseList;
    }

    @Override
    public boolean equals(Object obj) {
        PhdStudent p = (PhdStudent) obj;
        return super.equals(p) && this.department.equals(p.department) && Arrays.equals(this.courses, p.courses);
    }


}
