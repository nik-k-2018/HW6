public class Task4_4 {
    public static void main(String[] args) {
        double monthlyContribution = 15000; // Ежемесячный взнос
        double annualRate = 0.07;           // Годовая процентная ставка (7%)
        double monthlyRate = annualRate / 12; // Месячная ставка
        double total = 0;                    // Текущая сумма
        int month = 0;                       // Счетчик месяцев

        while (total < 12_000_000) {
            total += total * monthlyRate + monthlyContribution;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) total + " рублей");
        }
    }
}