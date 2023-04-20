/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeatherAnalyzer;
import java.util.HashSet;
import java.util.StringBuilder;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

public class WeatherAnalyzer {
    public static String analyzeWeatherData(int[][] weeklyMonthTemperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemps = new HashSet<>();

        for (int[] weekTemps : weeklyMonthTemperatures) {
            for (int temp : weekTemps) {
                uniqueTemps.add(temp);
                if (temp < minTemp) {
                    minTemp = temp;
                }
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemps.contains(temp)) {
                sb.append("Never saw temperature: ").append(temp).append("\n");
            }
        }

        return "High: " + maxTemp + "Low: " + minTemp + "n" + sb.toString();
    }
}

public class WeatherAnalyzerTest {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedOutput = {'High: 72' + 'Low: 51' + 'Never saw temperature: 63' + 'Never saw temperature: 67' + 'Never saw temperature: 68' + 'Never saw temperature: 69'};

        String actualOutput = WeatherAnalyzer.analyzeWeatherData(weeklyMonthTemperatures);

        if (expectedOutput.equals(actualOutput)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected output" + expectedOutput);
            System.out.println("Actual output" + actualOutput);
        }
    }
}