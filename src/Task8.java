public class Task8 {
    public static void main(String[] args) {
        int monthlyContribution = 29000;
        int total = 0;

        // Цикл от 1 до 12 месяцев
        for (int month = 1; month <= 12; month++) {
            total += monthlyContribution;

            // Выводим результат для каждого месяца
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
