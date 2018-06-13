package com.sagarborse.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UpdateFilteredObject {

    public static void main(String[] args) {
        List<Student> students = getData();
        Student input = new Student(2, "Santosh");

        System.out.println("Before");
        students.stream().forEach(System.out::println);

        Optional<Student> out = students.stream().filter(s -> s.getRoll() == input.getRoll()).findFirst();
        Student output = out.get();
        output.setName(input.getName());

        System.out.println("After");
        students.stream().forEach(System.out::println);
    }

    private static List<Student> getData() {
        Student s1 = new Student(1, "Sagar");
        Student s2 = new Student(2, "Abhijeet");
        Student s3 = new Student(3, "Vipin");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        return students;
    }
}

class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
