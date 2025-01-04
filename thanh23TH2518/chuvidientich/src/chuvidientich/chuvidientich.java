package chuvidientich;
import java.util.Scanner;
public class chuvidientich {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 Scanner scanner = new Scanner(System.in);

	        // Nhập bán kính từ người dùng
	        System.out.print("Nhập bán kính của hình tròn: ");
	        double banKinh = scanner.nextDouble();

	        // Tính chu vi và diện tích
	        double chuVi = 2 * Math.PI * banKinh;
	        double dienTich = Math.PI * Math.pow(banKinh, 2);

	        // Hiển thị kết quả
	        System.out.printf("Chu vi: %.2f%n", chuVi);
	        System.out.printf("Diện tích: %.2f%n", dienTich);

	        scanner.close();

	}

}
