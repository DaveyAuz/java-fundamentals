import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(getGreeting());
        pluralize("cat", 1);
        pluralize("cat", 2);
        flipNHeads(2);
        clock();
    }

    public static String getGreeting() {
        return "Hello World!";
    }
    //
    public static void pluralize(String word, int count) {
        if (count == 0 || count > 1) {
            System.out.println(word + "s");
        } else {
            System.out.println(word);
        }
    }
    //
    public static void flipNHeads(int n) {
        int count = 0;
        int heads = 0;
        while (heads < n) {
            double random = Math.random();
            if (random < 0.5) {
                System.out.println("tails");
                heads = 0;
            } else {
                System.out.println("heads");
                heads++;
            }
            count++;
        }
        System.out.println("It took " + count + " flips to flip " + n + " heads in a row.");
    }
    //
    public static void clock() {
        int seconds = 0;
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            if (second != seconds) {
                seconds = second;
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }
    }
}



// int dogCount = 1;
// System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

// int catCount = 2;
// System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

// int turtleCount = 0;
// System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
// I own 1 dog.
// I own 2 cats.
// I own 0 turtles.



