import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String multiWordVariable;
        final int NUM = 42;
                String word = "Hello World";
        multiWordVariable = NUM + word;
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);
        System.out.println("multiWordVariable: " + multiWordVariable);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное числол");
        } else {
            System.out.println("Вы сохранили ноль");
        }
            System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
        scanner.close();
        }
    }