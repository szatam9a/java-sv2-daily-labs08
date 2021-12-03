package day03;

import day03.FileReader;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void findSmallestDifferentTest() {
        FileReader fr = new FileReader();
        String winner= fr.findSmallestDifferent(Path.of("src/test/resources/datamunging/footbaal.dat"));
        assertEquals("Aston_Villa",winner);
    }
    @Test
    void findSmallestTemperatureSpreadTest() {
        FileReader fr = new FileReader();
                int day = fr.findSmallestTemperatureSpread(Path.of("src/test/resources/datamunging/weather.dat"));
        assertEquals(14,day);
    }
}