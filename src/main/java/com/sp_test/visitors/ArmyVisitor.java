package com.sp_test.visitors;

import com.sp_test.models.creatures.*;

public class ArmyVisitor implements Visitor {
    @Override
    public void visit(Elf elf) {
        System.out.println("ArmyVisitor visits Elf: " + elf.getName());
    }

    @Override
    public void visit(Gnome gnome) {
        System.out.println("ArmyVisitor visits Gnome: " + gnome.getName());
    }

    @Override
    public void visit(Ent ent) {
        System.out.println("ArmyVisitor visits Ent: " + ent.getName());
    }
}
