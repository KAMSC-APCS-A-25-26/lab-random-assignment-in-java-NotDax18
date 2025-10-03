import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        Random rando = new Random();
        // First three digits: each digit 0-7 (no 8 or 9)
        int d1 = rando.nextInt(8);
        int d2 = rando.nextInt(8);
        int d3 = rando.nextInt(8);
        String firstGroup = "" + d1 + d2 + d3;
        // Second three digits: 000-742
        int secondGroupNum = rando.nextInt(743); // 0 to 742 inclusive
        String secondGroup = String.format("%03d", secondGroupNum);
        // Third three digits: 000-999
        int thirdGroupNum = rando.nextInt(1000);
        String thirdGroup = String.format("%03d", thirdGroupNum);
        // Display in XXX-XXX-XXX format
        System.out.println(firstGroup + "-" + secondGroup + "-" + thirdGroup);
    }
}
