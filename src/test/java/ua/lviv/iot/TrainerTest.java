package ua.lviv.iot;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.gym.enums.PressParts;
import ua.lviv.iot.gym.managers.Trainer;
import ua.lviv.iot.gym.managers.TrainerImpl;
import ua.lviv.iot.gym.models.*;

import java.util.ArrayList;
import java.util.List;

public class TrainerTest {
    private Simulators ob1;
    private Simulators ob2;
    private Simulators ob3;
    private Simulators ob4;
    private List<Simulators> input;
    private Trainer trainer;


    @BeforeEach
    void setup() {
        this.ob1 = new Barbell(
          "barbell", 10, 10, "black", "lifting"
        );

        this.ob2 = new Dumbbells(
                "dumbbells", 30, 30, "silver", "pumping", 10
        );

        this.ob3 = new PressTrainingSimulator(
                "pressTrainingSimulator", 50, 50, "blue", "pressPumping", PressParts.MIDDLE_STOMACH_PRESS
        );

        this.ob4 = new Racetrack(
                "racetrack", 120, 80, "red", "running"
        );

        input = new ArrayList<>();
        input.add(ob1);
        input.add(ob2);
        input.add(ob3);
        input.add(ob4);
        trainer = new TrainerImpl(input);
    }

    @AfterEach
    void cleanUp() {
        input.clear();
    }

    @Test
    public void testSortByPrice() {
        List<Simulators> act = this.trainer.sortByPrice(false);

        for (int i = 0; i < act.size(); i++) {
            if (i==0) {
                continue;
            }
            assertTrue(act.get(i -1).getPrice() < act.get(i).getPrice(),
                    "Sorting by price doesn't work properly");
        }
    }

    @Test
    public void testReversedSortByPrice() {
        List<Simulators> act = this.trainer.sortByPrice(true);

        for (int i = 0; i < act.size(); i++) {
            if (i==0) {
                continue;
            }
            assertTrue(act.get(i -1).getPrice() > act.get(i).getPrice(),
                    "Sorting by price doesn't work properly");
        }
    }
}
