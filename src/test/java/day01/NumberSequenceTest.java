package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    NumberSequence number;
    @Test
    void closeToAverageTest() {
        number = new NumberSequence(Arrays.asList(1,9,5,5,5,5,5,5,5,5,6,7,8,9,5,5,5,5,5,5,5,3,4,2));
        assertEquals(15,number.closeToAverage(1).size());
        assertEquals(0,number.closeToAverage(0).size());
    }

    @Test
    void averageTest() {
        number = new NumberSequence(Arrays.asList(1,9,5,5,5,5,5,5,5,5));
        assertEquals(5,number.average());
    }
}