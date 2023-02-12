public class Main {

    public static void printSeparator() {
        System.out.println("++++++++++++++");
        System.out.println("--------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        task1();

        task2(0, 2013);
        task2(1, 2020);

        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Delivery will take " + deliveryDays + " days.");
    }

    public static void task1() {
        System.out.println("Task 1:");
        System.out.println("");
        class YearChecker {
            public void isBisextilYear(int year) {
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    System.out.println(year + " is a bisextil year.");
                } else {
                    System.out.println(year + " is not a bisextil year.");
                }
            }
        }

        new YearChecker().isBisextilYear(2020);


    }

    public static void task2(int operatingSystem, int clientDeviceYear) {

        System.out.println(" ");
        System.out.println("Task 2: ");
        System.out.println(" ");

        int currentYear = 2022;
        String operatingSystemString;
        if (operatingSystem == 0) {
            operatingSystemString = "iOS";
        } else {
            operatingSystemString = "Android";
        }

        if (clientDeviceYear < 2015) {
            System.out.println("Install the Lite version of the " + operatingSystemString + " app from the link.");
        } else if (clientDeviceYear >= 2015 && clientDeviceYear <= currentYear) {
            System.out.println("Install the normal version of the " + operatingSystemString + " app from the link.");
        } else {
            System.out.println("Device year is greater than current year.");

        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {

        System.out.println(" ");
        System.out.println("Task 3: ");
        System.out.println(" ");

        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
}

