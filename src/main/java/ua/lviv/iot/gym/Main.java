package ua.lviv.iot.gym;

import ua.lviv.iot.gym.managers.*;

public class Main {

    public static void main(String[] args) {
            TrainerImpl trainer = new TrainerImpl();

            trainer.setSimulators();

            trainer.sortByExerciseDuration(true);
            System.out.println();

            trainer.sortByPrice(false);
            System.out.println();

            trainer.sortByExercise(true);
            System.out.println();

    }
}
