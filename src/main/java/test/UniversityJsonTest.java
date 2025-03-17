package test;

import controller.JsonManager;
import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class UniversityJsonTest {

    @Test
    public void testUniversitySerialization() {
        // Создаем университет
        University oldUniversity = createTestUniversity();

        // Сохраняем в файл
        String filename = "university.json";
        JsonManager.writeUniversityToJson(oldUniversity, filename);

        // Читаем из файла
        University newUniversity = JsonManager.readUniversityFromJson(filename);

        // Для отладки выводим данные
        System.out.println("Old University: " + oldUniversity);
        System.out.println("New University: " + newUniversity);

        // Сравниваем объекты
        assertEquals(oldUniversity, newUniversity);
    }

    private University createTestUniversity() {
        // Створення студентів
        Human rector = new Human("Іван", "Петров", "Олександрович", Sex.MALE);
        Student student1 = new Student("Іван", "Петров", "Іванович", Sex.MALE);
        Student student2 = new Student("Анастасія", "Чернявська", "Юріївна", Sex.FEMALE);

        // Створення групи
        Group group1 = new Group("Група 122-21-2", rector, List.of(student1, student2));

        // Створення кафедри
        Department department1 = new Department("Кафедра програмного забезпечення комп'ютерних систем", rector, List.of(group1));

        // Створення факультету
        Faculty faculty1 = new Faculty("Факультет інформаційних технологій", rector, List.of(department1));

        // Створення університету
        University university = new University("НТУ Дніпровська політехніка", rector, List.of(faculty1));

        return university;
    }
}
