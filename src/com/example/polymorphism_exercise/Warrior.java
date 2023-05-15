package com.example.polymorphism_exercise;

public class Warrior extends Person {
    private Weapon weapon;

    public Warrior(String name) {
        super(name);
    }

    public void setWeapon(Weapon weapon) { this.weapon = weapon; }

    public void decHealth(int amt) {
        setHealth(Math.max(0, getHealth() - amt));
    }

    public void attack(Warrior opponent) {
        if (0 < getHealth() && 0 < opponent.getHealth() && weapon != null) {
            System.out.println(getName() + " is attacking " + opponent.getName());
            weapon.strike(opponent);
            System.out.println(opponent.getName() + " health = " + opponent.getHealth());
        }
    }
}
