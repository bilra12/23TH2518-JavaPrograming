package doidonvitiente;
import java.util.Scanner;
public class doidonvitiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("Chọn loại chuyển đổi tiền tệ:");
        System.out.println("1. USD -> VND");
        System.out.println("2. VND -> USD");
        System.out.println("3. EUR -> VND");
        System.out.println("4. VND -> EUR");
        System.out.print("Nhập lựa chọn (1-4): ");
        int lc = sc.nextInt();

        // Tỉ giá quy đổi
        final double USD_TO_VND = 24000;
        final double EUR_TO_VND = 26000;

        // Nhập số tiền
        System.out.print("Nhập số tiền: ");
        double soTien = sc.nextDouble();
        double ketQua = 0;

        // Chuyển đổi
        switch (lc) {
            case 1:
                ketQua = soTien * USD_TO_VND;
                System.out.printf("%.2f USD = %.2f VND%n", soTien, ketQua);
                break;
            case 2:
                ketQua = soTien / USD_TO_VND;
                System.out.printf("%.2f VND = %.2f USD%n", soTien, ketQua);
                break;
            case 3:
                ketQua = soTien * EUR_TO_VND;
                System.out.printf("%.2f EUR = %.2f VND%n", soTien, ketQua);
                break;
            case 4:
                ketQua = soTien / EUR_TO_VND;
                System.out.printf("%.2f VND = %.2f EUR%n", soTien, ketQua);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        sc.close();
	}

}
