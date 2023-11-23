package com.sp_test.models.creatures;

public interface Creature extends Cloneable {
    String getName();
    int getHealth();
    int getAttackPower();
    void performAction();
}
