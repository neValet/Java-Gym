package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.BarbellTypes;

public class Barbell extends Simulators {

    private BarbellTypes barbellTypes;

    public Barbell() {
    }

    public Barbell(String name, double price, int exerciseDuration, String colour, String exercise) {
        super(name, price, exerciseDuration, colour, exercise);
    }

    public BarbellTypes getBarbellTypes() {
        return barbellTypes;
    }

    public void setBarbellTypes(BarbellTypes barbellTypes) {
        this.barbellTypes = barbellTypes;
    }
}
