package ua.lviv.iot.gym.models;

public class Dumbbells extends Simulators {
    private double weight;

    public Dumbbells(String dumbbells, int i, int i1, String gray, String dumbbelsLifting) {

    }

    public Dumbbells(String name, double price, int exerciseDuration, String colour, String excercise, double weight) {
        super(name, price, exerciseDuration, colour, excercise);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
