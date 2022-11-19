import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, f1 = 0, f2 = 1, total;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the number of elements");
            num = inp.nextInt();
        }while (num < 0);
        System.out.print(f1 + " " + f2);
        total = f1 + f2;
        for(int i = 0; i < (num-2); i++) {
            System.out.print(" " + total);
            f1 = f2;
            f2 = total;
            total = f1 + f2;
        }
    }
}