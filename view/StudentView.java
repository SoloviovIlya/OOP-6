package view;

import model.Group;
import model.Student;

import java.util.List;

//Создать package – view. Работу продолжаем в нем
//Создать класс StudentView, содержащий в себе метод вывода в консоль
//данных студента поданных на вход
public class StudentView {
    public void printStudent(List<Student> listStudent){
        System.out.println("Все студенты:\n" + listStudent);
    }

    public void printGroup(Group group) {
        System.out.println("Преподаватель группы: " + group.getTeacher());
        System.out.println("Студенты в группе:\n" + group.getStudents());
    }
}
