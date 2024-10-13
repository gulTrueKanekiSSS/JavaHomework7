//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task 2
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.print("\n");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.print("\n");

        //task 3
        int populationY = 12000000;

        for (int year = 1; year <= 10; year++) {
            populationY += (populationY / 1000) * (17 - 8);
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }

        //task4
        int money = 15000;
        int requireMonths = 0;

        while (money <= 12000000) {
            money += (money / 100) * 7;
            requireMonths++;
            System.out.println("Сумма накоплений за " + requireMonths + " месяц: " + money);
        }
        System.out.println("Потребуется " + requireMonths + " месяцев");

        //task 5
        int money2 = 15000;
        int requireMonths2 = 0;

        while (money2 <= 12000000) {
            requireMonths2++;
            money2 += (money2 / 100) * 7;
            if (requireMonths2 % 6 == 0) {
                System.out.println("Сумма накоплений за " + requireMonths2 + " месяц: " + money2);
            }
        }
        System.out.println("Потребуется " + requireMonths2 + " месяцев");

        //task 6
        int vasyaMoney = 15000;

        int everyHalfYear = 18;
        while (everyHalfYear > 0) {
            for (int i = 1; i <= 6; i++) {
                vasyaMoney += (vasyaMoney / 100) * 7;
            }
            everyHalfYear--;
            System.out.println(vasyaMoney);
        }

        //task 7
        int numOfFirstFriday = 3;

        do {
            System.out.println("Сегодня пятница, " + numOfFirstFriday + "-е число. Необходимо подготовить отчет");
            numOfFirstFriday += 7;
        } while (numOfFirstFriday <= 31);

        //task 8

        int year = 0;

        while (year <= 2124) {
            if (year >= 1824) {
                System.out.println(year);
            }
            year += 79;
        }
    }
}
