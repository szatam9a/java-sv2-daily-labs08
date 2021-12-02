package day03.Footbaal;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FootBaalGameTest {

    @Test
    void findSmallestDifferentTest() {
        FootBaalGame fbg = new FootBaalGame();
        System.out.println(fbg.findSmallestDifferent(Path.of("src/test/resources/datamunging/footbaal.dat")));
    }
}