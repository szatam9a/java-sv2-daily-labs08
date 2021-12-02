package day03.Footbaal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FootBaalGame {
    private List<String> file;


    private FootBaalGame readIn(Path path) {
        try {
            file = Files.readAllLines(path);
            file.remove(18);
            file.remove(0);
        } catch (IOException io) {
            throw new IllegalStateException("no file to read", io);
        }
        return this;
    }

    public String findSmallestDifferent(Path path) {
        String data = readIn(path).processData();
        if ( data == null) {
            throw new IllegalStateException("No winner");
        }
        else
        return data;
    }

    private String processData() {
        String team;
        int f;
        int a;
        int minDiff = Integer.MAX_VALUE;
        String theWinner = null;
        for (String line : file
        ) {
            f = Integer.parseInt(line.substring(43, 45));
            a = Integer.parseInt(line.substring(50, 52));
            team = line.substring(7, 23).trim();

            if ((a - f)  < minDiff) {
                minDiff = (a - f);
                theWinner = team;
            }
        }
        return theWinner;
    }
}
