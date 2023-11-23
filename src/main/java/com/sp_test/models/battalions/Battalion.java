package com.sp_test.models.battalions;
import com.sp_test.models.creatures.*;

import java.util.List;

public interface Battalion {
    String getBattalionType();
    List<Creature> getCreatures();
    void attack();
    void addCreature(Creature creature);
}
