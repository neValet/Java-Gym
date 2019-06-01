package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.*;

import java.util.List;

public interface Trainer {

    List<Simulators> sortByExerciseDuration(boolean reverse);
    List<Simulators> sortByPrice (boolean reverse);
    List<Simulators> sortByExercise (boolean reverse);
    void  setSimulators();
}
