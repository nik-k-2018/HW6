public class Task3_3 {
    public static void main(String[] args) {
        // Начальная численность населения (в тыс. чел.)
        long population = 12_000_000;

        // Коэффициенты рождаемости и смертности
        int birthRate = 17;
        int deathRate = 8;

        // Чистый прирост на 1000 человек
        int netGrowthPerThousand = birthRate - deathRate; // 9

        // Цикл на 10 лет
        for (int year = 1; year <= 10; year++) {
            // Прирост за год
            long growth = (population / 1000) * netGrowthPerThousand;

            // Обновляем численность населения
            population += growth;

            // Выводим результат
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}