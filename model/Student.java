package model;

public class Student extends User{
    private int studentId;

    private double average;

    public Student(String name, int age, double average) {
        super(name, age);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
