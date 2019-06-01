package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.Simulators;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.List;


public class SimulatorsWriter {

    public void writeToFile(final List<Simulators> simulators)
            throws IOException {
        File myFile = new File("Simulators.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw);) {

            simulators.stream().forEach(simulator -> {
                try {
                    bufWriter.write(simulator.getHeaders());
                    bufWriter.newLine();
                    bufWriter.write(simulator.toCSV());
                    bufWriter.newLine();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });

        } finally {
            System.out.println(" ");
        }
    }
}
