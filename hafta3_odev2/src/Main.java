import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int total = 0;

        System.out.print("Is it perfect: ");
        int n = input.nextInt();

        for (int i=1; i < n; i++){
            if (n % i == 0)
            {
                total += i;
            }
        }
        if (total == n)
        {
            System.out.println(n + "it is perfect.");
        } else {
            System.out.println(n + "it is not perfect.");
        }
    }
}