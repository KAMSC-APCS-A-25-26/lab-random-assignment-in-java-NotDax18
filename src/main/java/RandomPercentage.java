import java.util.Random;
import java.text.DecimalFormat;
public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
        Random unseededRandom = new Random();
        Random seededRandom = new Random(12345);
        double unseededValue = unseededRandom.nextDouble();
        double seededValue = seededRandom.nextDouble();
        double unseededPercent = unseededValue * 100;
        double seededPercent = seededValue * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Unseeded Random: " + df.format(unseededPercent) + "%");
        System.out.println("Seeded Random: " + df.format(seededPercent) + "%");
    }
}