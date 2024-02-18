package service;

import model.Teacher;
import model.User;

import java.util.List;

public interface TeacherService {
    List<Teacher> read();
    Teacher create(User user);
}
