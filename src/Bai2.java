import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Tỉ giá chuyển đổi: 1 USD = 23,000 VND (Ví dụ)
        double exchangeRate = 23000;

        // Nhập giá trị tiền USD từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double usdAmount = scanner.nextDouble();

        // Tính giá trị tiền VND
        double vndAmount = usdAmount * exchangeRate;

        // Hiển thị kết quả
        System.out.println(usdAmount + " USD = " + vndAmount + " VND");
    }
}
