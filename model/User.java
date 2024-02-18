package model;

//Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
//наследники собственные параметры (какие, по вашему выбору – Пример:
//studentId для Student, teacherId для Teacher
public abstract class User {
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
