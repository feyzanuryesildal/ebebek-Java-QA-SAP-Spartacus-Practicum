import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the inverted triangle size: ");
        k=scan.nextInt();

        for (int i = 0; i <= k;i++){
            for (int n=1; n<=i; n++){
                System.out.print(" ");
            }
            for (int n=1; n<=(2*k-(2*i+1)); n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}