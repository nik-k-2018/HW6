public class Task8 {
    public static void main(String[] args) {
        int monthlyContribution = 15000; // Ежемесячный взнос
        int targetAmount = 2_459_000;    // Цель накоплений
        int total = 0;                    // Текущая сумма накоплений
        int month = 0;                    // Счетчик месяцев

        // Цикл while: продолжаем копить, пока не достигнем цели
        while (total < targetAmount) {
            total += monthlyContribution;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
