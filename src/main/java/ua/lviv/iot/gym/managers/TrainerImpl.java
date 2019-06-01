package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainerImpl implements Trainer {

    private List<Simulators> result = new ArrayList<Simulators>();

    @Override
    public void setSimulators() {
        result.add(new Racetrack("racetrack", 2000, 900, "White", "jogging"));
        result.add(new PressTrainingSimulator("pressTrainingSimulator", 200, 600, "Black", "pressLifting"));
        result.add(new Barbell("Barbell", 250, 1200, "Silver", "liftingFromChest"));
        result.add(new Dumbbells("Dumbbells", 80, 1200, "Gray", "dumbbellsLifting"));
    }

    @Override
    public List<Simulators> sortByExerciseDuration(boolean reverse) {

        int reverser = reverse ? 1 : -1;
        result.sort((Simulators o1, Simulators o2) -> reverser * (o1.getExerciseDuration() - o2.getExerciseDuration()));
        result.forEach((simulators) -> System.out.println(simulators.getExerciseDuration()));
        return result;
    }

    @Override
    public List<Simulators> sortByPrice(boolean reverse) {

        int reverser = reverse ? 1 : -1;
        result.sort((Simulators o1, Simulators o2) -> (int) (reverser * (o1.getPrice() - o2.getPrice())));
        result.forEach((simulators) -> System.out.println(simulators.getPrice()));
        return result;
    }

    @Override
    public List<Simulators> sortByExercise(boolean reverse){
        int reverser = reverse ? 1 : -1;

        result.sort(Comparator.comparing(Simulators::getExerciseDuration));
        result.sort(Comparator.comparing(Simulators::getPrice));
        result.forEach((simulators) -> System.out.println(simulators.getExercise()));

        return result;
    }
}
