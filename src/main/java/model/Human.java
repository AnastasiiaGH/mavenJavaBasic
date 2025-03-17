package model;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    // Геттери та сеттери

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(patronymic, human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, sex);
    }
    public static class Student extends Human {
        public Student(String firstName, String lastName, String patronymic, Sex sex) {
            super(firstName, lastName, patronymic, sex);
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getSex() {
        return sex;
    }
}
