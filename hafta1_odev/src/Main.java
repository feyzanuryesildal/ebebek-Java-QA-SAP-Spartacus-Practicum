import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int endeksMin = 18;
        int endeks25 = 25;
        int endeks30 = 30;
        int endeksMax = 35;

        System.out.print("Boyunuzu girin(cm) : ");
        double height = scanner.nextDouble();

        System.out.print("Kilonuzu girin(cm) : ");
        double weight = scanner.nextDouble();


        height=height/100;
        double endeks  = weight/(height*height);

        System.out.println(height);
        System.out.println(weight);
        if(endeks <endeksMin)
        {
            System.out.print(String.format("ZAYIF vki: %f", endeks));
        }
        else if(endeks >= endeksMin && endeks <endeks25)
        {
            System.out.print(String.format("NORMAL vki %f", endeks));
        }
        else if(endeks >= endeks25 && endeks <endeks30)
        {
            System.out.print(String.format("KİLOLU vki: %f", endeks));
        }
        else if(endeks >= endeks30 && endeks <endeksMax)
        {
            System.out.print(String.format("OBEZ vki: %f", endeks));
        }
        else
        {
            System.out.print(String.format("CİDDİ OBEZ vki: %f", endeks));
        }
    }
}