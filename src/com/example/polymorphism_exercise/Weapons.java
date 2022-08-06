package com.example.polymorphism_exercise;
class Sword extends Weapon {
    public boolean strike(Warrior opponent) {
        System.out.println("Slashing " + opponent.getName());
        opponent.decHealth(5);
        // etc.
        return false;
    }
}

class Wand extends Weapon {
    public boolean strike(Warrior opponent) {
        System.out.println("Mesmerizing " + opponent.getName());
        opponent.decHealth(3);
        // etc.
        return false;
    }
}


class Whip extends Weapon {
    public boolean strike(Warrior opponent) {
        System.out.println("Snapping " + opponent.getName());
        opponent.decHealth(4);
        // etc.
        return false;
    }
}
