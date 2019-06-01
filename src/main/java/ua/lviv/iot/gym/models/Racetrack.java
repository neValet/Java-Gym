package ua.lviv.iot.gym.models;

public class Racetrack extends Simulators {

    private int speed;

    public Racetrack() {

    }

    public Racetrack(String name, double price, int exerciseDuration, String colour, String exercise) {
        super(name, price, exerciseDuration, colour, exercise);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


