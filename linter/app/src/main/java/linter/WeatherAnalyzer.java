package linter;

import java.util.HashSet;

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

        return "High: " + maxTemp + "Low: " + minTemp + "n" + sb;
    }
}
