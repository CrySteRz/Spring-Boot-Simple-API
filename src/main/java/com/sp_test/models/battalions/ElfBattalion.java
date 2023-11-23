package com.sp_test.models.battalions;
import com.sp_test.models.creatures.*;
import java.util.ArrayList;
import java.util.List;

public class ElfBattalion implements Battalion {
    private List<Creature> creatures;
    private String battalionType;

    public ElfBattalion() {
        this.creatures = new ArrayList<>();
        this.battalionType = "Elf Battalion";
    }

    @Override
    public String getBattalionType() {
        return battalionType;
    }

    @Override
    public List<Creature> getCreatures() {
        return creatures;
    }

    @Override
    public void attack() {
        System.out.println("Elf battalion attacks!");
        creatures.forEach(Creature::performAction);
    }

    @Override
    public void addCreature(Creature creature) {
        creatures.add(creature);
    }

}
