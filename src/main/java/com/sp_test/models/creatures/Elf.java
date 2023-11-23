package com.sp_test.models.creatures;

public class Elf implements Creature {
    private String name;
    private int health;
    private int attackPower;

    public Elf(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void performAction() {
        System.out.println("Elf attacks gracefully!");
    }
}
