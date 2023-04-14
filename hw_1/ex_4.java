package hw_1;
import java.util.Scanner;

/*
 * Реализовать простой калькулятор (
 *  введите первое число,
 *  введите второе число,
 *  введите требуемую операцию,
 *  ответ
 * )
 */

public class ex_4 {
    public static void main(String[] args) {
        double number_1 = Double.parseDouble(getInfo("введите первое число"));
        String action = getInfo("введите требуемую операцию");
        double number_2 = Double.parseDouble(getInfo("введите второе число"));
        double result;
        switch (action) {
            case ("+"):
                result = number_1 + number_2;
                break;
            case ("-"):
                result = number_1 - number_2;
                break;
            case ("*"):
                result = number_1 * number_2;
                break;
            case ("/"):
                result = number_1 / number_2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.printf("ответ: %s\n", result);
    }

    static String getInfo(String helpText) {
        System.out.printf("введите %s\n", helpText);
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        return row;
    }
}
