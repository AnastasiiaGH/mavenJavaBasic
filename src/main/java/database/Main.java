package database;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        StudentSQL studentSQL = new StudentSQL();
        List<Student> students = studentSQL.getStudentsByMonth(month);

        if (students.isEmpty()) {
            System.out.println("Студентів, народжених у цьому місяці, немає.");
        } else {
            System.out.println("Студенти, народжені у " + month + "-му місяці:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
