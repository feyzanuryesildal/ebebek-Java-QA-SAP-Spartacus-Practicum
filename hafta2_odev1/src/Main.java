import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter distance in km: ");
            double distance = scan.nextDouble();

            System.out.println("Enter your age: ");
            double age = scan.nextDouble();

            System.out.println("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
            int tip = scan.nextInt();

            while (true) {
                if (tip != 1 && tip != 2) {
                    System.out.println("1 or 2");
                    break;
                }
                double finalPrice;
                double normalPrice = distance * 0.10;
                if (age < 12) {
                    finalPrice = normalPrice / 2;
                    if (tip == 2) {
                        finalPrice = (normalPrice * 0.8) * 2;
                    }
                    System.out.println("your total debt: " + finalPrice);
                }
                if (age >= 12 && age < 24) {
                    finalPrice = normalPrice * 0.9;
                    if (tip == 2) {
                        finalPrice = (normalPrice * 0.8) * 2;
                    }
                    System.out.println("your total debt: " + finalPrice);
                }
                if (age > 65) {
                    finalPrice = normalPrice * 0.7;
                    if (tip == 2) {
                        finalPrice = (normalPrice * 0.8) * 2;
                    }
                    System.out.println("your total debt: " + finalPrice);
                } else {
                    System.out.println("your total debt: " + normalPrice);
                }
                break;
            }
        }

    }
}