// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год являтся високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf(i + " ");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf(i + " ");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int monthlyDeposit = 29000;
        int totalDeposit = 0;
        for (int i = 1; i <= 12; i += 1) {
            totalDeposit = totalDeposit + monthlyDeposit;
        }
        System.out.println(totalDeposit);

    }

    public static void task9() {
        System.out.println("Задача 9");
        int monthlyDeposit = 29000;
        int totalDeposit = 0;

        for (int i = 1; i <= 12; i += 1) {
            totalDeposit = totalDeposit + totalDeposit / 100;
            System.out.printf(" Месяц %d, сумма накоплений %d рублей", i, totalDeposit);
            totalDeposit = totalDeposit + monthlyDeposit;
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int constanta = 2;
        int result;
        for (int i = 1; i <= 10; i += 1) {
            result = constanta * i;
            System.out.println(constanta + "*" + i + "=" + result);
        }
    }
}
