import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void checkNum() {
        System.out.println("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isValid = true;
        while (isValid) {
            try {
                num = in.nextInt();
                isValid = false;
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число:");
                in.next();
            }
        }
        int magicNum = 7;
        if (num > magicNum) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно " + magicNum);
        }
    }
}
