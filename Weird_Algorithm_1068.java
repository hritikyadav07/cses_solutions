import java.util.Scanner;
class Weird_Algorithm_1068 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
        input.close();
    }
}