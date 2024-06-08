import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int newYear = 2000;
        printIsleapYear(newYear);
        printValidTypeInfo(0, 2024);
        colculateDeliveryDays(110);
    }

    public static void printIsleapYear(int year) {
        System.out.println("Задача-1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год -високосный год");
        } else {
            System.out.println(year + "- не является високосным");
        }

    }


    public static void printValidTypeInfo(int type, int year) {
        System.out.println("Задача-2");
        int currentYear = LocalDate.now().getYear();
        String resultType;
        String resultStatus;
        if (type == 1) {
            resultType = "IOS";
        } else {
            resultType = "Android";
            if (type < currentYear) {
                resultStatus = "облегченную";
            } else {
                resultStatus = "";
            }
            System.out.printf("Требуется установить %s версию приложения %s", resultStatus, resultType);
        }

    }

    public static int colculateDeliveryDays(int distance) {
        System.out.println();
        System.out.println("Задача-3");
        int resultDays = 1;
        if (distance >= 20) {
            resultDays++;
        }
        if (distance >= 60) {
            resultDays++;
        }
        if (distance >= 100) {
            System.out.println("Доставки нет");
            return -1;
        }
        return resultDays;

    }
}