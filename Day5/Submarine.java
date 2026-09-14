package Day5;

public class Submarine {
    private boolean isUnderwater;
    private double depthUnderwater;
    private double remainingOxygen;
    private double remainingBattery;
    private int numberOfPeople;
}

public Submarine() {
    int numberOfPeople = 150;
    boolean isUnderwater = true;
    double depthUnderwater = 10;
    double remainingOxygen = 100;
    double remainingBattery = 100;
}

public void depth(double howDeepToDescend) {
    double depthUnderwater = depthUnderwater - howDeepToDescend;

}

public void depth(int NumberOfPeople) {
    if numberOfPeople > 100 {
        System.out.println("Uh oh, there is way too many people on this submarine. Looks like we need to remove some.");
        int numberRemoved = NumberOfPeople - 100;
        int numberOfPeople = 100;
        System.out.println("I removed " + numberRemoved + "people for you! Now your submarine has the proper amount of 100 people!");
    }
    else {
    \
    
        System.out.println("Looks like your submarine is properly-sized!");
    }
}




