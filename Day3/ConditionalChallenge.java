package Day3;

public class ConditionalChallenge {
    public static void main(String[] args) {
         System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 75.0;
        boolean isCold = true;
        if (isCold == true) {
            temperature = temperature - 15;
        }
        else{ 
            temperature = temperature + 10;
        }
        System.out.println("Temperature: " + temperature);

        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 85;
        if(score <= 69 ){
            System.out.println("Failed");
        }
        else{
            System.out.println("Passed");
        }
            
        System.out.println("--- Part 3: Season Determiner ---");
        int temp = 65;
        if(temp >= 81){
            System.err.println("Season: Summer");
        }
        else if (temp >= 60){
            System.err.println("Season: Spring");
        }
        else if (temp >= 40){
            System.err.println("Season: Fall");
        }
        else if (temp <= 39){
            System.err.println("Season: Winter");
        }


        System.out.println("--- Part 4: Number Classifier ---");
        int number = 42;
        System.err.println("Number: " + number);
        if (number >= 1){
            System.err.println(number + "is Positive");
        }
        else if (number == 0) {
            System.err.println(number + "is Zero");
        }
        else if (number <= -1){
            System.err.println(number + " is Negative");
        }
        if (number % 2 == 0){
            System.err.println(number + "is even");
        }
        if (number % 2 != 0){
            System.err.println(number + "is Odd");
        if (number % 5 == 0) {
            System.err.println(number + "is Multiple of 5");
        }
        if (number % 3 == 0){
            System.err.println(number + "is a Multiple of 3");
        }
        }
            
        }
    }

