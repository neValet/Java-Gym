package ua.lviv.iot;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import ua.lviv.iot.gym.enums.BarbellTypes;
import ua.lviv.iot.gym.enums.PressParts;
import ua.lviv.iot.gym.models.*;

import static ua.lviv.iot.gym.enums.BarbellTypes.OLYMPIC;

public class SimulatorsTest {
    public static final int TEST = 1;


    @Test
    public void testBarbell() {
        Barbell barbell = new Barbell();
        barbell.setBarbellTypes(OLYMPIC);
        assertEquals(OLYMPIC, barbell.getBarbellTypes());
    }

    @Test
    public void testDumbbells() {
        Dumbbells dumbbells = new Dumbbells();
        dumbbells.setWeight(TEST);
        assertEquals(TEST, dumbbells.getWeight());
    }

    @Test
    public void testPressTrainingSimulator() {
        PressTrainingSimulator pressTrainingSimulator = new PressTrainingSimulator();
        pressTrainingSimulator.setPressParts(PressParts.LOWER_STOMACH_PRESS);
        assertEquals(PressParts.LOWER_STOMACH_PRESS, pressTrainingSimulator.getPressParts());
    }

    @Test
    public void testRacetrack() {
        Racetrack racetrack = new Racetrack();
        racetrack.setSpeed(TEST);
        assertEquals(TEST, racetrack.getSpeed());
    }

    @Test
    public void testSimulatorsGettersAndSetters() {
        Simulators simulators = new Simulators();
        simulators.setName("Hi");
        simulators.setPrice(10);
        simulators.setExerciseDuration(10);
        simulators.setColour("white");
        simulators.setExercise("jogging");
        assertAll("Getters or setters don't work properly",
                () -> assertEquals("Hi", simulators.getName()),
                () -> assertEquals(10, simulators.getPrice()),
                () -> assertEquals(10, simulators.getExerciseDuration()),
                () -> assertEquals("white", simulators.getColour()),
                () -> assertEquals("jogging", simulators.getExercise()));
    }
}
