package com.sp_test.models.battalions;
//Composite Pattern
import com.sp_test.models.creatures.*;

import java.util.ArrayList;
import java.util.List;

public class CompositeBattalion implements Battalion {
    private String battalionType;
    private List<Battalion> subBattalions;

    public CompositeBattalion(String battalionType) {
        this.battalionType = battalionType;
        this.subBattalions = new ArrayList<>();
    }

    @Override
    public String getBattalionType() {
        return battalionType;
    }

    public void addSubBattalion(Battalion battalion) {
        subBattalions.add(battalion);
    }

    public void removeSubBattalion(Battalion battalion) {
        subBattalions.remove(battalion);
    }

    @Override
    public List<Creature> getCreatures() {
        List<Creature> creatures = new ArrayList<>();
        for (Battalion battalion : subBattalions) {
            creatures.addAll(battalion.getCreatures());
        }
        return creatures;
    }

    @Override
    public void attack() {
        for (Battalion battalion : subBattalions) {
            battalion.attack();
        }
    }

    @Override
    public void addCreature(Creature creature) {
        throw new UnsupportedOperationException();
    }

    // Alte metode specifice pentru batalioane compozite
}
