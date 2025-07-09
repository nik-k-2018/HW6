public class Task8_8 {
    public static void main(String[] args) {
        int currentYear = 2023;         // Текущий год
        int cometPeriod = 79;            // Период появления кометы

        int startYear = currentYear - 200; // Начало периода (200 лет назад)
        int endYear = currentYear + 100;   // Конец периода (100 лет вперёд)

        // Поиск первого года появления кометы после startYear
        int firstVisibleYear;

        // Вычисляем первый год после startYear, который делится на период без остатка
        if (startYear % cometPeriod == 0) {
            firstVisibleYear = startYear;
        } else {
            firstVisibleYear = ((startYear / cometPeriod) + 1) * cometPeriod;
        }

        System.out.println("Комета появлялась или появится в следующих годах:");

        for (int year = firstVisibleYear; year <= endYear; year += cometPeriod) {
            System.out.println(year);
        }
    }
}