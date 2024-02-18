package model;

public class Teacher extends User{
    private int teacherId;

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

}
