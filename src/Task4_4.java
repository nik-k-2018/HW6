public class Task4_4 {
    public static void main(String[] args) {
        double monthlyContribution = 15000; // Ежемесячный взнос
        double annualRate = 0.07;           // Годовая ставка (7%)
        double monthlyRate = annualRate / 12; // Месячная ставка
        double total = 0;                    // Текущая сумма накоплений
        int month = 0;                       // Счетчик месяцев

        // Цикл для 10 лет (120 месяцев)
        for (month = 1; month <= 120; month++) {
            // Добавляем ежемесячный взнос и начисляем проценты
            total += total * monthlyRate + monthlyContribution;

            // Выводим результат
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) total + " рублей");
        }
    }
}