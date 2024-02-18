package service;

import model.Group;
import model.Student;
import model.Teacher;

import java.util.List;

public class GroupService implements GroupManager{
    @Override
    public Group makeGroup(Teacher teacher, List<Student> students) {
        return new Group(teacher, students);
    }
}
