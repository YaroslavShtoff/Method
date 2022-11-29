import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        int year  = 2022;
        boolean leapYear = isLeapYear(year);
        printYearInfo(year,  leapYear);

        int clientOS = 1;
        int productionYear = 2015;
        printInfoAboutDevice( clientOS, productionYear);

        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней " + deliveryDays);
    }
// Задание 3
    private static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = 1;
        }else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);

        }
        return deliveryDays;

    }

  //Задание 2

    private static String getOsByType(int type) {
        if (type == 1 ){
            return "Android ";
        }else if (type == 0 ) {
            return "iOS";
        } else {
            return "unknown";
        }
        }
    private static String getTypeOfVersion(int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear==currentYear) {
            return " Обычную ";
        }else {
            return " Lite";
        }
    }

    private static void printInfoAboutDevice(int type, int productionYear){
    String os = getOsByType(type);
        String typeofVersion = getTypeOfVersion(productionYear);

        System.out.println(" Установите" + typeofVersion + "облегченную версию приложения для " + os);

    }



    //Задание 1
    private static boolean isLeapYear (int year ){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
    private static void printYearInfo (int year,  boolean leapYear){
        if (leapYear) {
            System.out.println("Год " + year  +  " - високосный");
        }else{
            System.out.println("Год " + year  +  " - не високосный");

        }
    }
}