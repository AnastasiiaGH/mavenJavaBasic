package model;

public class Student extends Human {
    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false; // Сравнение с классом Human
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Используем хэшкод от Human
    }


}
