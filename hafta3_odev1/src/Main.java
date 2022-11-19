import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("How many numbers will be entered?: ");
        int num = a.nextInt();
        int max =0,min =0;
        for (int i =1 ; i <= num;i++){

            System.out.print("Enter the " + i+ "th number:");
            int c =a.nextInt();
            if(i == 1){
                max=c;
                min=c;
            }
            else{
                if (c > max){
                    max = c;
                }
                else if (c < min){
                    min = c;
                }
            }
        }
        System.out.println("Biggest number : "+ max);
        System.out.println("Smallest number: "+ min);
    }
}