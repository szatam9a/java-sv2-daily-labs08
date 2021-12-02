package day03;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {


    public int findSmallestTemperatureSpread(String filename) {
        List<String> file;
        try {
            file = Files.readAllLines(Path.of(filename));
        } catch (IOException io) {
            throw new IllegalStateException("no file to read", io);
        }
        removeIrrelevantData(file);
        return readIntoData(file);
    }


    public void removeIrrelevantData(List<String> file){
        file.remove(0);
        file.remove(0);
        file.remove(file.size() - 1);
    }
    public int readIntoData(List<String> file) {
        WeaterData weaterData = new WeaterData();
        int resultday=0;
        int minDiff = Integer.MAX_VALUE;
        int min;
        int day;
        int max;

        for (String line : file
        ) {
            weaterData.readInData(line);
            weaterData.checkTheDay();
        }
        return weaterData.getResultDay();
    }

}

