package hw_1;

/*
 * Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
 */

public class ex_3 {
    public static void main(String[] args) {
        getSimpleNumbers(1000);
    }

    static void getSimpleNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            boolean flag = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
