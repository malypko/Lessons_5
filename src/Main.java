import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp = read();
        System.out.println("Ответ: " + temp);
        }

    public static int read () {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число возводимое в степень: ");
        n = in.nextInt();
        int s;
        System.out.println("Введите степень: ");
        s = in.nextInt();
        int temp = expon (n, s);
        return temp;
    }
    public static int expon (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

}
