package com.sp_test.visitors;

import com.sp_test.models.creatures.*;

public interface Visitor {
    void visit(Elf elf);
    void visit(Gnome gnome);
    void visit(Ent ent);
}
