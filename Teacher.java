import java.util.Arrays;

public class Teacher extends Person {
    private String department, courses[];

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
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
        Teacher t = (Teacher) obj;
        return super.equals(t) && this.department.equals(t.department) && Arrays.equals(this.courses, t.courses);
    }

}
