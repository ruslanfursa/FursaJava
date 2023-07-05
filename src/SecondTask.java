
import java.util.Scanner;

public class SecondTask {
    public static void compareName() {
        Scanner scanner = new Scanner(System.in);
        String magicName = "Вячеслав";
        System.out.println("Введите имя:");
        String inputName = scanner.next();
        if (magicName.equals(inputName)) {
            System.out.println("Привет, " + magicName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
