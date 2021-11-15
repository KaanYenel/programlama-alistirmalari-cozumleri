
import java.util.Scanner;


public class Exercise_02_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Celsius cinsinden sıcaklık değerini giriniz: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (9.0 / 5) * celsius + 32;
        
        System.out.println(celsius + " celsius = " + fahrenheit + " fahrenheit");
    }
}
