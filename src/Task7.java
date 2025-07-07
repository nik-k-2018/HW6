public class Task7 {
    public static void main(String[] args) {
        // Начальное значение
        int number = 1;

        // Цикл для вывода 10 чисел
        for (int i = 0; i < 10; i++) {
            System.out.print(number + " ");
            number *= 2; // Увеличиваем в 2 раза
        }

        // Переход на новую строку после вывода
        System.out.println();
    }
}