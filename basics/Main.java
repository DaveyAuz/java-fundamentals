
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
        return word + "s";
    }
    return word;

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

}

}



