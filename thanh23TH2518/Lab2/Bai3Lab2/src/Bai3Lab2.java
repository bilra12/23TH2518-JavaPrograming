import java.util.Scanner;

public class Bai3Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng từ bàn phím
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        // Tính tiền điện theo phương pháp lũy tiến
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        // Xuất kết quả
        System.out.println("Số tiền điện phải trả: " + tien + " VND");
    }
}
