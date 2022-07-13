package com.example.polymorphism_exercise;
class Sword extends Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Slashing " + opponent.getName());
        opponent.decHealth(5);
        // etc.
    }
}

class Wand extends Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Mesmerizing " + opponent.getName());
        opponent.decHealth(3);
        // etc.
    }
}

class Whip extends Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Snapping " + opponent.getName());
        opponent.decHealth(4);
        // etc.
    }
}
