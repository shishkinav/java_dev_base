package hw_1;

/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

public class ex_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(triangle(i));
        }
    }

    static int triangle(int n) {
        int T = (n * (n + 1)) / 2;
        return T;
    }
}
