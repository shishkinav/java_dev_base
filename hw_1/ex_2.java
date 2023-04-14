package hw_1;

/*
 * Вычислить n! (произведение чисел от 1 до n)
 */

public class ex_2 {
    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(4));
        System.out.println(factorial(10));
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
