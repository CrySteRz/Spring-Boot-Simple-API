package com.sp_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sp_test.services.ArmyService;
import com.sp_test.models.creatures.*;

import java.util.List;

@RestController
@RequestMapping("/army")
public class ArmyController {
    private final ArmyService armyService;

    @Autowired
    public ArmyController(ArmyService armyService) {
        this.armyService = armyService;
    }
    @GetMapping("/showAllBattalionsAndCreatures")
    public List<String> showAllBattalionsAndCreatures() {
        return armyService.showAllBattalionsAndCreatures();
    }
    @GetMapping("/showAllBattalions")
    public List<String> showAllBattalions() {
        return armyService.showAllBattalions();
    }
    @GetMapping("/showAllCreatures")
    public List<String> showAllCreatures() {
        return armyService.showAllCreatures();
    }

    @PostMapping("/createBattalion")
    public String createBattalion(@RequestParam String type) {
        try {
            armyService.createBattalion(type);
            return "Battalion created successfully!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @PostMapping("/addCreatureToBattalion")
    public String addCreatureToBattalion(@RequestParam int battalionIndex,
                                         @RequestParam String type,
                                         @RequestParam String name,
                                         @RequestParam int health,
                                         @RequestParam int attackPower) {
        try {
            Creature creature = armyService.createCreature(type, name, health, attackPower);
            armyService.addCreatureToBattalion(battalionIndex, creature);
            return "Creature added to battalion successfully!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
