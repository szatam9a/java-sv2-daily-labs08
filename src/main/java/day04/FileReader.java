package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {
    private List<String> file = new ArrayList<>();

    public List<String> readIn(Path path) {
        try {
            file = Files.readAllLines(path);
            return file;
        } catch (IOException io) {
            throw new IllegalStateException("no file to read");
        }
    }

    public int findSmallestTemperatureSpread(Path path) {

        readIn(path);
        int day;
        int min;
        int max;
        int minDiff = Integer.MAX_VALUE;
        int resultday =0;
        List<String> filtered =removeLines(file, 0,1,file.size()-1);
        for (String line : filtered
        ) {
            min = Integer.parseInt(line.substring(12, 14));
            max = Integer.parseInt(line.substring(6, 8));
            day = Integer.parseInt(line.substring(2, 4).trim());

            if (doReplace(max, min, minDiff)) {
                resultday = day;
                minDiff= max-min;
            }
        }
        return resultday;
    }

    public String findSmallestDifferent(Path path) {
        readIn(path);
        String team;
        int f;
        int a;
        int minDiff = Integer.MAX_VALUE;
        String theWinner = null;
        List<String> filtered =removeLines(file, 0,18);
        for (String line : filtered
        ) {
            f = Integer.parseInt(line.substring(43, 45));
            a = Integer.parseInt(line.substring(50, 52));
            team = line.substring(7, 23).trim();

            if (doReplace(a, f, minDiff)) {
                theWinner = team;
                minDiff= Math.abs(a-f);
            }
        }
        return theWinner;
    }

    public boolean doReplace(int first, int second, int minDiff) {
        if (Math.abs(first - second) < minDiff) {
            return true;
        } else
            return false;
    }
    public List<String> removeLines(List<String> lines,Integer... filtered){
        List<String> filteredList = new ArrayList<>();
        List<Integer> filers = Arrays.asList(filtered);
        for (int i= 0; i<lines.size();i++)
            if (filers.contains(i)){

            } else
                filteredList.add(lines.get(i));
    return filteredList;}
}

