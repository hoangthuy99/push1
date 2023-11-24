import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter number
        System.out.print("Enter a  number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 3 and 5
        if (isDivisibleBy3And5(number)) {
            System.out.println(number + " divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }

    // Method to check divisibility by both 3 and 5
    private static boolean isDivisibleBy3And5(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

}
