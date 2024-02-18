package service;

import model.Student;
import model.User;

import java.util.List;

public interface Service {
    List<Student> read();
    Student create(User user);
}
