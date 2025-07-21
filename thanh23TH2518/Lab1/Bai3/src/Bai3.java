import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương từ bàn phím
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Tính thể tích khối lập phương
        double theTich = Math.pow(canh, 3);

        // Xuất thể tích
        System.out.println("Thể tích của khối lập phương là: " + theTich);
    }
}
