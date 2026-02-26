public class Student extends Person{
private String studentId;

public Student(String firstName, String lastName, String gender, String studentId) {
    super(firstName, lastName, gender);
    this.studentId = studentId;
}

public String getStudentId() {
    return this.studentId;

}

public void setStudentId(String studentId) {
    this.studentId = studentId;
}

@Override
public String toString() {
    return super.toString() + " - Student ID: " + studentId;
}

@Override
public boolean equals(Object obj) {
    Student s = (Student) obj;
    return super.equals(s) && this.studentId.equals(s.studentId);
}

}
