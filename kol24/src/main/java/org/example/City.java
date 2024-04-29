package org.example;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class City {

    public String capital;
    public int sTimeLine;
    public double geoWidth;
    public double geoLength;

    private static City parseLine(String line){
            City result = new City();
            String[] afterSplit = line.split(",");
            result.capital = afterSplit[0];
            result.sTimeLine = parseInt(afterSplit[1]);
            result.geoWidth = parseDouble(afterSplit[2]);
            result.geoLength = parseDouble(afterSplit[3]);

            return result;
    }
    private static Map<String, City> parseFile(Path path){
        Map<String,City> map = new HashMap<>();

        FileReader file = null;
        try {
            file = new FileReader(path.toFile());
            BufferedReader buffer = new BufferedReader(file);
            String line = "";
            while((line = buffer.readLine()) != null){
                City tempC = parseLine(line);
                String tempS = tempC.capital;
                map.put(tempS,tempC);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

}
