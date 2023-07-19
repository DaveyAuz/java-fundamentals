package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String name;
    private int capacity;
    private String location;
    private List<String> movies;

    public Theater(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.movies = new ArrayList<>();
        setMovies(movies);
    }

    public void addMovie(String movie) {
        movies.add(movie);
        Theater theater = new Theater("ABC Theater", 12500, "Athens");

        theater.addMovie("Mission Impossible: Dead Reckoning Pt1");
        theater.addMovie("Oppenheimer");

        System.out.println(theater.getMovies()); // Output: [Mission Impossible: Dead Reckoning Pt1, Oppenheimer]

        theater.removeMovie("Mission Impossible: Dead Reckoning Pt1");

        System.out.println(theater.getMovies()); // Output: [Oppenheimer]

    }
    public void removeMovie(String movie) {
        movies.remove(movie);
        System.out.println(movies);
    }

    // Other methods, getters, and setters (omitted for brevity)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Theater: ").append(name).append("\n");
        sb.append("Location: ").append(location).append("\n");
        sb.append("Capacity: ").append(capacity).append("\n");
        sb.append("Movies: ").append(movies).append("\n");
        return sb.toString();
    }

}

