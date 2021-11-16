
import java.util.Scanner;


public class Exercise_02_02 {
    public static void main(String[] args){
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sırasıyla silindirin yarıçap ve uzunluk değerini giriniz: ");
        double yaricap = input.nextDouble();
        double uzunluk = input.nextDouble();
        
        double alan = yaricap * yaricap * PI;
        double hacim = alan * uzunluk;
        
        System.out.println("Silindirin alanı = " + alan + " Silindirin hacmi = " + hacim);
    }
}
