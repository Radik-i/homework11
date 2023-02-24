import java.util.Scanner;
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void yearCheck (int auditedYear) { // для задачи 1
        if (auditedYear % 400 == 0)  System.out.println(auditedYear + " год является високосным");
        else if (auditedYear  % 4 == 0 && auditedYear % 100 !=0) System.out.println(auditedYear + " год является високосным");
        else System.out.println(auditedYear + " год не является високосным");
    }
    public static void task1() {
        System.out.println("Задача 1");
            int year = 2011;
            yearCheck(year);
            System.out.println();
    }
    public static void versionCheck (int clientOS, int clientDeviceYear) { // для задачи 2
        if (clientOS == 0 && clientDeviceYear >=2015 ) System.out.println("Установите обычную версию приложения для iOS по ссылке");
        else if (clientOS == 0 && clientDeviceYear <2015 ) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear >=2015 ) System.out.println("Установите обычную версию приложения для Android по ссылке");
        else System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    public static void task2() {
        System.out.println("Задача 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свою используемую операционную систему:");
        System.out.println("0 — iOS, 1 — Android");
        int OS = sc.nextInt();
        System.out.println("Введите год выпуска устройства");
        int deviceYear = sc.nextInt();
        versionCheck(OS,deviceYear);
        System.out.println();
    }
    public static void deliveryCalculation (int deliveryDistance) { // для задачи 3
        int days=1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {days = days +1;
            System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {days = days +2;
            System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else System.out.println("Доставка карты не осуществляется");
    }
    public static void task3() {
        System.out.println("Задача 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние до адреса доставки в км");
        int shippingDistance = sc.nextInt();
        deliveryCalculation (shippingDistance);
        System.out.println();
    }
}