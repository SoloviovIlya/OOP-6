package service;

import model.Group;
import model.Student;
import model.Teacher;

import java.util.List;

public interface GroupManager {
    Group makeGroup(Teacher teacher, List<Student> students);
}
