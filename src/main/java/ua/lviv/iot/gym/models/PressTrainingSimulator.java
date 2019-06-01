package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.PressParts;

public class PressTrainingSimulator extends Simulators {

    private PressParts pressParts;

    public PressTrainingSimulator(String pressTrainingSimulator, int i, int i1, String black, String pressLifting) {

    }

    public PressTrainingSimulator(String name, double price, int exerciseDuration, String colour, String exercise, PressParts pressParts) {
        super(name, price, exerciseDuration, colour, exercise);
    }

    public PressParts getPressParts() {
        return pressParts;
    }

    public void setPressParts(PressParts pressParts) {
        this.pressParts = pressParts;
    }
}
