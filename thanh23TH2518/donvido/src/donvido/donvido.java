package donvido;
import java.util.Scanner;
public class donvido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        // Menu
	        System.out.println("Chọn loại chuyển đổi:");
	        System.out.println("1. Mét -> Km");
	        System.out.println("2. Km -> Mét");
	        System.out.println("3. Cm -> Mét");
	        System.out.println("4. Mét -> Cm");
	        System.out.print("Nhập lựa chọn (1-4): ");
	        int lc = sc.nextInt();

	        // Nhập giá trị
	        System.out.print("Nhập giá trị: ");
	        double gt = sc.nextDouble();
	        double kq = 0;

	        // Chuyển đổi
	        switch (lc) {
	            case 1:
	                kq = gt / 1000;
	                System.out.printf("%.2f m = %.2f km%n", gt, kq);
	                break;
	            case 2:
	                kq = gt * 1000;
	                System.out.printf("%.2f km = %.2f m%n", gt, kq);
	                break;
	            case 3:
	                kq = gt / 100;
	                System.out.printf("%.2f cm = %.2f m%n", gt, kq);
	                break;
	            case 4:
	                kq = gt * 100;
	                System.out.printf("%.2f m = %.2f cm%n", gt, kq);
	                break;
	            default:
	                System.out.println("Không hợp lệ.");
	        }

	        sc.close();
	}

}
