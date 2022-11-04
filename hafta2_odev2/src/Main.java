import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int remainder = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int year = inp.nextInt();

        remainder = year % 12;
        if (remainder == 0) {
            System.out.println("Your Chinese Zodiac Sign: Monkey");
        }
        if (remainder == 1) {
            System.out.println("Your Chinese Zodiac Sign: Rooster");
        }
        if (remainder == 2) {
            System.out.println("Your Chinese Zodiac Sign: Dog");
        }
        if (remainder == 3) {
            System.out.println("Your Chinese Zodiac Sign: Pig");
        }
        if (remainder == 4) {
            System.out.println("Your Chinese Zodiac Sign: Mouse");
        }
        if (remainder == 5) {
            System.out.println("Your Chinese Zodiac Sign: Ox");
        }
        if (remainder == 6) {
            System.out.println("Your Chinese Zodiac Sign: Tiger");
        }
        if (remainder == 7) {
            System.out.println("Your Chinese Zodiac Sign: Rabbit");
        }
        if (remainder == 8) {
            System.out.println("Your Chinese Zodiac Sign: Dragon");
        }
        if (remainder == 9) {
            System.out.println("Your Chinese Zodiac Sign: Snake");
        }
        if (remainder == 10) {
            System.out.println("Your Chinese Zodiac Sign: Horse");
        }
        if (remainder == 11) {
            System.out.println("Your Chinese Zodiac Sign: Sheep");
        }
    }
}