import java.util.Random;

public class Main {
    public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);
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



public static String pluralize(String word, int count) {
    if (count == 0 || count > 1) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        return word + "s";
    }
    return word;
}




    public static void flipNHeads(int n) {
        Random rand = new Random();
        int flips = 0;
        int heads_in_a_row = 0;

        while (heads_in_a_row < n) {
            double flip = rand.nextDouble();
            flips++;

            if (flip < 0.5) {
                System.out.println("tails");
                heads_in_a_row = 0;
            } else {
                System.out.println("heads");
                heads_in_a_row++;
            }
        }

        System.out.printf("It took" + flips + " flips to flip " + n + "heads in a row.");
    }

}





