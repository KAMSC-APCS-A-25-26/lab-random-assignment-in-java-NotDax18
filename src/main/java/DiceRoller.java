import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        
        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
        Random unseed1 = new Random();
        Random unseed2 = new Random();
        Random unseed3 = new Random();

        // Create one Random object with a seed (seeded die)
        int seed = 12345;
        Random seeded = new Random(seed);

        // Generate dice rolls (1-6) for each die
        int roll1 = unseed1.nextInt(6) + 1;
        int roll2 = unseed2.nextInt(6) + 1;
        int roll3 = unseed3.nextInt(6) + 1;
        int seededRoll = seeded.nextInt(6) + 1;

        // Display results with clear labels
        System.out.println("Unseeded Die 1: " + roll1);
        System.out.println("Unseeded Die 2: " + roll2);
        System.out.println("Unseeded Die 3: " + roll3);
        System.out.println("Seeded Die: " + seededRoll);
    }
}
