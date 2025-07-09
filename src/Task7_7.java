public class Task7_7 {
    public static void main(String[] args) {
        int firstFriday = 3; // Первая пятница выпала на 3 число

        System.out.println("В этом месяце пятницы выпадают на:");
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }
}