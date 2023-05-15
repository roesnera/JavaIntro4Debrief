package com.example.polymorphism_exercise;

public class Person {
    private final String name;
    private int health;

    public Person(String name) {
        this.name = name;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }
}
