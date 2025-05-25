package com.noob.model;

import jakarta.enterprise.context.ApplicationScoped;

public class Human {
    private String name = "Noob";
    private int age = 20;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
