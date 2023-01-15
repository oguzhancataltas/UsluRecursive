import java.util.Scanner;

public class Main {

    static int usluRecursive(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return usluRecursive(a,b-1) * a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz : ");
        int base = scanner.nextInt();

        System.out.print("Üs Değerini Giriniz : ");
        int pow = scanner.nextInt();

        System.out.println("Sonuç : " + usluRecursive(base,pow));
    }
}
