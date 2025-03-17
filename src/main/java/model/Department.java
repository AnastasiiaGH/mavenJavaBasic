package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Department {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
    }

    // Геттери та сеттери

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department department = (Department) o;
        return Objects.equals(name, department.name) &&
                Objects.equals(head, department.head) &&
                Objects.equals(groups, department.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, groups);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", groups=" + groups +
                '}';
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
