import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n;
//
//        do {
//            System.out.print("Nhập n: ");
//            n = Integer.parseInt(sc.nextLine());
//        } while (n <= 0);
//
//        for (int i = 0; i <= n; i++) {
//            int temp = i;
//            int dem = 0;
//
//            int t = temp;
//            while (t != 0) {
//                t /= 10;
//                dem++;
//            }
//
//            int sum = 0;
//            t = temp;
//
//            while (t != 0) {
//                int d = t % 10;
//                int sum1 = 1;
//
//                for (int j = 0; j < dem; j++) {
//                    sum1 *= d;
//                }
//
//                sum += sum1;
//                t /= 10;
//            }
//
//            if (sum == temp) {
//                System.out.print(temp + " ");
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập n: ");
//        int n = sc.nextInt();
//
//        if (n <= 0) {
//            System.out.print("Số nhập vào không hợp lệ.");
//        } else {
//            int sum = 0;
//            for (int i = 1; i <= n; i++) {
//                sum += i;
//            }
//            System.out.printf("Tổng các số từ 1 đén %d là: %d", n, sum);
//            }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập tháng: ");
//        int month = sc.nextInt();
//
//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.printf("Tháng %d có 31 ngày", month);
//                break;
//            case 4, 6, 9, 11:
//                System.out.printf("Tháng %d có 30 ngày", month);
//                break;
//            case 2:
//                System.out.printf("Tháng %d có 28 hoặc 29 ngày", month);
//                break;
//            default:
//                System.out.print("Tháng không hợp lệ");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.print("Tổng các chữ số là: " + sum);
    }
}