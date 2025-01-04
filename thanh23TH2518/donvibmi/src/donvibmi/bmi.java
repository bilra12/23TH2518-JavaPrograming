package donvibmi;
import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Nhập chiều cao và cân nặng
        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.print("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // Phân loại BMI
        System.out.printf("Chỉ số BMI: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Phân loại: Gầy");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }

        sc.close();
	}

}
