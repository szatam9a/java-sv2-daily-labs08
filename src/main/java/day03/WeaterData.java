package day03;

public class WeaterData {
    private int min;
    private int max;
    private int day;
    private int resultDay;
    private int minDiff = Integer.MAX_VALUE;

    public WeaterData() {
    }
    public void readInData(String line){
        day = Integer.parseInt(line.substring(2, 4).trim());
        min = Integer.parseInt(line.substring(12, 14));
        max = Integer.parseInt(line.substring(6, 8));
    }
    public void checkTheDay(){
        if ((max - min) < minDiff) {
            minDiff = (max - min);
            resultDay = day;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getDay() {
        return day;
    }

    public int getResultDay() {
        return resultDay;
    }

    public int getMinDiff() {
        return minDiff;
    }
}
