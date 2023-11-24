import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length : ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width : ");
        double width = scanner.nextDouble();

        // Calculate perimeter and area
        double perimeter = 2 * (length + width);
        double area = length * width;

        // Display results
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }
}
