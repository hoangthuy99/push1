import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter subject scores from the user
        System.out.print("Enter Math scores: ");
        double math = scanner.nextDouble();

        System.out.print("Enter literature score: ");
        double literature = scanner.nextDouble();

        System.out.print("Enter English subject scores: ");
        double english = scanner.nextDouble();

        // Calculate average score
        double average = (math + literature + english) / 3;

        // Display average score

        System.out.println("Average score: " + average);
        if (0 <=average && average <5) {
            System.out.println(" Poor rating");
        } else if (5 <=average && average <6.5) {
            System.out.println("Average rating.");
        } else if (6.5<=average && average <8) {
            System.out.println("Good");
        } else if (8 <=average && average <9) {
            System.out.println("Very good");
        } else {
            System.out.println(" Excellent rating");
        }
    }
}
