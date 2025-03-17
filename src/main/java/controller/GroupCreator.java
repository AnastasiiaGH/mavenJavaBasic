package controller;

import model.*;

import java.util.List;

public class GroupCreator implements Creator<Group> {
    private String name;
    private Human head;
    private List<Student> students;

    public GroupCreator(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
    }

    @Override
    public Group create() {
        return new Group(name, head, students);
    }
}
