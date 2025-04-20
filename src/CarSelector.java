import java.util.InputMismatchException;
import java.util.Scanner;

public class CarSelector {
    public static void main(String[] args) {
        // Создаём сканер для ввода с клавиатуры
        try (Scanner scan = new Scanner(System.in)) {

            // Массив с названиями автомобилей
            String[] carBrands = {"Volvo", "Mercedes-Benz", "BMW", "Lada Vesta", "Toyota Camry"};

            // Запрос у пользователя индекса
            System.out.print("Please enter the index of a car (number between 0 and " + (carBrands.length - 1) + "): ");

            // Чтение целого числа
            int selectedIndex = scan.nextInt();

            // Проверка, находится ли введённый индекс в допустимом диапазоне
            if (selectedIndex < 0 || selectedIndex >= carBrands.length) {
                System.out.println("Invalid input: index must be between 0 and " + (carBrands.length - 1) + ".");
            } else {
                // Вывод выбранного автомобиля
                System.out.println("You selected: " + carBrands[selectedIndex]);
            }

        } catch (InputMismatchException e) {
            // Обработка ситуации, когда пользователь ввёл не целое число
            System.out.println("Error: Please enter a valid whole number (integer).");
        }
    }
}