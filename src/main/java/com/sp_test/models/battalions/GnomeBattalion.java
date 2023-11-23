package com.sp_test.models.battalions;
import com.sp_test.models.creatures.*;
import java.util.ArrayList;
import java.util.List;
public class GnomeBattalion implements Battalion {
    private final String battalionType;
    private List<Creature> creatures;

    public GnomeBattalion() {
        this.creatures = new ArrayList<>();
        this.battalionType = "Gnome Battalion";
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
        System.out.println("Gnome battalion attacks!");
        creatures.forEach(Creature::performAction);
    }

    @Override
    public void addCreature(Creature creature) {
        creatures.add(creature);
    }
}
