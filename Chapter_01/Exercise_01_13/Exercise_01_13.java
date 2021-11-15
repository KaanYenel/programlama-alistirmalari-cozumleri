/*
verilen formülde sembollerle sayıları yer değiştirirsek:
a = 3.4
b = 50.2
c = 2.1
d = 0.55
e = 44.5
f = 5.9
bilgisine ulaşırız. 
sonra değerleri formülde yerine koyarak x ve y'nin değerine ulaşılır.
*/
public class Exercise_01_13 {
    public static void main(String[] args){
        System.out.println("x'in değeri = ");
        System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.println("y'nin değeri = ");
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
    }
}
