package controller;

import model.*;
import java.util.List;
public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("Університет: " + university.getName());
    }
    public static University createTypicalUniversity() {
        // Створення студентів
        StudentCreator studentCreator = new StudentCreator("Іван", "Петров", "Іванович", Sex.MALE);
        Student student1 = studentCreator.create();
        Student student2 = new StudentCreator("Анастасія", "Чернявська", "Юріївна", Sex.FEMALE).create();
        // Створення групи
        GroupCreator groupCreator = new GroupCreator("Група 122-21-2", student1, List.of(student1, student2));
        Group group = groupCreator.create();

        // Створення кафедри
        Department department = new Department("Кафедра програмного забезпечення комп'ютерних систем", student1, List.of(group));

        // Створення факультету
        Faculty faculty = new FacultyCreator("Факультет інформаційних технологій", student1, List.of(department)).create();

        // Створення університету
        return new University("НТУ Дніпровська політехніка", student1, List.of(faculty));
    }
}
