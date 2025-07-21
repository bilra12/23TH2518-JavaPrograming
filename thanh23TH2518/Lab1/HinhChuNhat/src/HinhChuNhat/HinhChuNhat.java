package HinhChuNhat;
import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        // Nhập chiều rộng từ bàn phím
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả ra màn hình
        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
