package com.sp_test.services;

import com.sp_test.models.battalions.*;
import com.sp_test.models.creatures.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArmyService {
    private List<Battalion> battalions;

    public ArmyService() {
        this.battalions = new ArrayList<>();
    }
    public Creature createCreature(String type, String name, int health, int attackPower) {
        switch (type.toLowerCase()) {
            case "elf":
                return new Elf(name, health, attackPower);
            case "gnome":
                return new Gnome(name, health, attackPower);
            case "ent":
                return new Ent(name, health, attackPower);
            default:
                throw new IllegalArgumentException("Invalid creature type!");
        }
    }
    public void createBattalion(String type) {
        switch (type.toLowerCase()) {
            case "elf":
                battalions.add(new ElfBattalion());
                break;
            case "gnome":
                battalions.add(new GnomeBattalion());
                break;
            case "ent":
                battalions.add(new EntBattalion());
                break;
            default:
                throw new IllegalArgumentException("Invalid battalion type!");
        }
    }

    public void addCreatureToBattalion(int battalionIndex, Creature creature) {
        if (battalionIndex >= 0 && battalionIndex < battalions.size()) {
            battalions.get(battalionIndex).addCreature(creature);
        } else {
            throw new IllegalArgumentException("Invalid battalion index!");
        }
    }

    public void attackAllBattalions() {
        for (Battalion battalion : battalions) {
            battalion.attack();
        }
    }
    public List<String> showAllBattalions() {
        List<String> battalionInfoList = new ArrayList<>();
        for (int i = 0; i < battalions.size(); i++) {
            Battalion battalion = battalions.get(i);
            String battalionInfo = "Battalion " + i + " - " + battalion.getBattalionType();
            battalionInfoList.add(battalionInfo);
        }
        return battalionInfoList;
    }
    public List<String> showAllCreatures() {
        List<String> creatureInfoList = new ArrayList<>();
        for (int i = 0; i < battalions.size(); i++) {
            Battalion battalion = battalions.get(i);
            List<Creature> creatures = battalion.getCreatures();
            if (creatures != null && !creatures.isEmpty()) {
                for (Creature creature : creatures) {
                    String creatureInfo = String.format("Name: %s, Battalion: %s (%d), Health: %d, Attack Power: %d",
                            creature.getName(), battalion.getBattalionType(), i, creature.getHealth(), creature.getAttackPower());
                    creatureInfoList.add(creatureInfo);
                }
            }
        }
        return creatureInfoList;
    }


    public List<String> showAllBattalionsAndCreatures() {
        List<String> battalionInfoList = new ArrayList<>();
        int battalionNumber = 0;
        for (Battalion battalion : battalions) {
            List<Creature> creatures = battalion.getCreatures();
            if (creatures != null && !creatures.isEmpty()) {
                for (Creature creature : creatures) {
                    battalionInfoList.add("Battalion " + battalionNumber + " - " + battalion.getBattalionType() + " - " + creature.getName());
                }
            } else {
                // Adaugă o înregistrare pentru batalionul fără creaturi sau fă ceva pentru a trata cazul
                battalionInfoList.add("Battalion " + battalionNumber + " - " + battalion.getBattalionType() + " - No creatures");
            }
            battalionNumber++;
        }
        return battalionInfoList;
    }





}