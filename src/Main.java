import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int newYear = 2000;
        printIsLeapYear(newYear);
        printValidTypeInfo(0, 2024);
        calculateDeliveryDays(100);
    }

    public static void printIsLeapYear(int year) {
        System.out.println();
        System.out.println("Задача-1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " - не является високосным,%n");
        }

    }


    public static void printValidTypeInfo(int type, int year) {
        System.out.println();
        System.out.println("Задача-2");
        int currentYear = LocalDate.now().getYear();
        String resultType;
        String resultStatus;
        if (type == 0) {
            resultType = "IOS";
        } else
            resultType = "Android";
        if (year > currentYear) {
            resultStatus = "облегченную";
        } else {
            resultStatus = "";
        }
        System.out.printf("Требуется установить %s версию приложения %s,%n", resultStatus, resultType);


    }

    public static int calculateDeliveryDays(int distance) {
        System.out.println();
        System.out.println("Задача-3");
        int resultDays = 1;
        if (distance <= 20) {
            resultDays++;
        }
        if (distance <= 60) {
            resultDays++;
            System.out.println("Потребуется дней: " + resultDays);
        }
        if (distance >= 100) {
            System.out.println("Доставки нет");
            return -1;
        }
        return resultDays;
    }

}