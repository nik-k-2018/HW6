public class Task9 {
    public static void main(String[] args) {
        // Начальная сумма вклада
        double initialDeposit = 10000;
        // Процентная ставка в месяц (12% годовых / 12 месяцев)
        double monthlyInterestRate = 0.12 / 12;

        // Переменная для хранения текущей суммы
        double currentAmount = initialDeposit;

        // Вывод начальной суммы
        System.out.println("Месяц 0, сумма накоплений равна " + currentAmount + " рублей");

        // Цикл для расчёта накоплений за каждый месяц
        for (int month = 1; month <= 12; month++) {
            // Добавляем проценты к текущей сумме
            currentAmount += currentAmount * monthlyInterestRate;

            // Выводим результат для текущего месяца
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", currentAmount) + " рублей");
        }
    }
}