import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và b từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        // Xét giá trị của a và b để giải phương trình
        if (a == 0) {
            if (b == 0) {
                // Vô số nghiệm
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                // Vô nghiệm
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính và xuất nghiệm x = -b/a
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
