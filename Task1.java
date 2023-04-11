//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Добавить функции 1) Добавление номера
//2) Вывод всего 
//Пример:
//Я ввожу: 1
//К: Введите фамилию
//Я: Иванов
//К: Введите номер
//Я: 1242353
//К: Введите 1) Добавление номера
//2) Вывод всего 
//Я ввожу: 1
//К: Введите фамилию
//Я: Иванов
//К: Введите номер
//Я: 547568
//К: Введите 1) Добавление номера
//2) Вывод всего 
//Я: 2
//Иванов: 1242353, 547568
/**
 * Task1
 */
import java.util.HashMap;
import java.util.Scanner;




public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Введите 1, чтобы добавить номер, или 2, чтобы вывести всю книгу, или q для выхода: ");
            String choice = scan.nextLine();

            if (choice.equals("q")) {
                System.out.println("Работа программы завершена");
                break;
            } else if (choice.equals("1")) {
                System.out.print("Введите фамилию: ");
                String lastName = scan.nextLine();
                System.out.print("Введите номер телефона: ");
                String phoneNumber = scan.nextLine();

                if (phoneBook.containsKey(lastName)) {
                    String oldNumbers = phoneBook.get(lastName);
                    phoneBook.put(lastName, oldNumbers + ", " + phoneNumber);
                } else {
                    phoneBook.put(lastName, phoneNumber);
                }

            } else if (choice.equals("2")) {
                for (String lastName : phoneBook.keySet()) {
                    String numbers = phoneBook.get(lastName);
                    System.out.println(lastName + ": " + numbers);
                }
            } else {
                System.out.println("Неверный выбор, попробуйте еще раз");
            }
        }
    }
}
    



