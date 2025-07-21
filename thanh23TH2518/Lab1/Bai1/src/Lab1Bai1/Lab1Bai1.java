package Lab1Bai1;
import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên từ bàn phím
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình từ bàn phím
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình theo định dạng yêu cầu
        System.out.printf("%s %.2f điểm\n", hoTen, diemTB);

        // Đóng đối tượng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
