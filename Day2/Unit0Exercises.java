package Day2;


public class Unit0Exercises {
    public static void main(String[] args) {
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;
        System.out.println("--- Variable Snapshot ---");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);
        score = score + 5;
        price = price + 2.5;
        isPassing = false;
        System.out.println("--- After Updates ---");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);
    }
}
