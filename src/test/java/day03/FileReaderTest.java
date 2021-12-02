package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void findSmalestTempertaureSpreadTest() {
        FileReader fl = new FileReader();
        System.out.println(fl.findSmallestTemperatureSpread("src/test/resources/datamunging/weather.dat"));
    }
}