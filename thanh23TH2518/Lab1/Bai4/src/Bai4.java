import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số của phương trình bậc 2 từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Tính căn delta
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta là: " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn delta thực.");
        }
    }
}
