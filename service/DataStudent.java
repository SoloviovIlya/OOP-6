package service;

import model.Student;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudent implements Service{

    List<Student> listStudents = new ArrayList<>();
    @Override
    public List<Student> read() {
        return listStudents;
    }

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudents.size()+1);
        listStudents.add(student);
        return student;
    }
}
