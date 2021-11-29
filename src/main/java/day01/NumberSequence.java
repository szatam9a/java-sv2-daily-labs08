package day01;

import java.util.ArrayList;
import java.util.List;

public class NumberSequence {
    private List<Integer> listOfInt;

    public NumberSequence(List<Integer> listOfInt) {
        this.listOfInt = listOfInt;
    }

    public NumberSequence(int howManyRandom, int minimum, int maximum) {
        listOfInt = new ArrayList<>();
        for (int i = 0; i < howManyRandom; i++) {
            listOfInt.add((int) (Math.random() * (maximum - minimum) + minimum));
        }
    }

    public List<Integer> closeToAverage(int range) {
        List<Integer> result = new ArrayList<>();
        int average = average();
        for (int i : listOfInt
        ) {
            if (Math.abs(average - i) < range) {
                result.add(i);
            }
        }
        return result;
    }

    public int average() {
        int sum = 0;
        for (int i : listOfInt
        ) {
            sum += i;
        }
        int result = sum / listOfInt.size();
        return result;
    }
}
