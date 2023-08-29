import java.util.Scanner;

// Bài tập giải phương trình bậc nhất ax+ b =0
public class Main {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);  // lệnh để in

        System.out.println("Nhap vao a = ");
        a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Phuong trinh vô nghiệm");
        } else {
            System.out.println("Nhap vao b = ");
            b = sc.nextDouble();
            x = -b / a;
            System.out.println("Phương trình có nghiệm kép x =" + x);
        }
    }
}
