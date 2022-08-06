package com.example.polymorphism_exercise;

public class Person {
    private final String name;
    private int health;

    public Person(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
