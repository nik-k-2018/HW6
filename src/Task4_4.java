public class Task4_4 {
    public static void main(String[] args) {
        double monthlyContribution = 15000; // Ежемесячный взнос
        double annualRate = 0.07;           // Годовая ставка (7%)
        double monthlyRate = annualRate / 12; // Месячная ставка
        double total = 0;                    // Текущая сумма накоплений

        System.out.println("Исходная сумма: " + (int)total + " рублей");

        // Цикл по месяцам (9 лет = 108 месяцев)
        for (int month = 1; month <= 108; month++) {
            total += total * monthlyRate + monthlyContribution;

            // Проверяем, является ли текущий месяц шестым, двенадцатым и т.д.
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) total + " рублей");
            }
        }
    }
}