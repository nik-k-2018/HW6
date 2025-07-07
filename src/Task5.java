public class Task5 {
    public static void main(String[] args) {
        // Перебираем годы от 1904 до 2096
        for (int year = 1904; year <= 2096; year++) {
            // Проверяем, является ли год високосным
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }
    }
}