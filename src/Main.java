import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int newYear = 1200;
        printIsLeapYear(newYear);
        printValidTypeInfo(1, 2024);// все работает корректно
        calculateDeliveryDays(100);
    }

    public static void printIsLeapYear(int year) {
        System.out.println();
        System.out.println("Задача-1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// о каком символе идет речь? его сдесь нет
            System.out.println(year + " год - високосный год");// о каком символе идет речь? его сдесь нет
        } else {
            System.out.println(year + " - не является високосным");// о каком символе идет речь? его сдесь нет
        }

    }


    public static void printValidTypeInfo(int type, int year) {
        System.out.println();
        System.out.println("Задача-2");
        int currentYear = LocalDate.now().getYear();
        String resultType;
        String resultStatus;
        if (type == 1) {
            resultType = "IOS";
        } else
            resultType = "Android";
        if (year < currentYear) {
            resultStatus = "облегченную";
        } else {
            resultStatus = "";
        }
        System.out.printf("Требуется установить %s версию приложения для %s", resultStatus, resultType);// вывод проверил все норм
        System.out.println();
    }

    public static int calculateDeliveryDays(int km) {
        System.out.println();
        System.out.println("Задача-3");
        if (km <= 20) {
            System.out.println("Потребуется дней:1");
        } else if (km > 20 && km < 60) {
            System.out.println("Потребуется дней:2");
        } else if (km >= 60 && km < 100) {
            System.out.println("Потребуется дней:3");
        } else if (km >= 100) {
            System.out.println("доставки нет.");// все корректно
        }
        System.out.println();

        return km;
    }
}// весь код проверил все работает что нужно еще исправить?
