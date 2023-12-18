package vonglap.ontap;

import java.util.Scanner;

// Nhập vào N. Kiểm tra xem N có phải là số nguyên tố hay không?
// Mở rộng: Nhập vào N số và đếm xem có bao nhiêu số nguyên tố trong N số vừa nhập.

public class Bai1Snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số N :");
        int N = scanner.nextInt();
        if (isPrime(N)){
            System.out.println(N + " Là số nguyên tố");
        } else {
            System.out.println(N + " Không phải là số nguyên tố");
        }
        System.out.println(" Nhập vào "+ N + " số :");
        int count = 0;
        for (int i = 0;i < N ; i ++){
            int num = scanner.nextInt();
            if(isPrime(num)){
                count++;
            }
        }
        System.out.println("Có " + count + " số nguyên tố trong " + N + " số vừa nhập");
    }

    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
                //Nếu số đó chia hết cho 2 đến căn bậc hai của số đó, nó không phải là số nguyên tố
            }
        }
        return true;
    }
}

