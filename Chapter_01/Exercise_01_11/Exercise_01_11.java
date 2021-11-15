
public class Exercise_01_11 {
    public static void main(String[] args){
        System.out.println("Bir yıldaki doğum sayısı = " + (365 * 24 * 60 * 60) / 7);
        System.out.println("Bir yıldaki ölüm sayısı = " + (365 * 24 * 60 * 60) / 13);
        System.out.println("Bir yıldaki göçmen sayısı = " + (365 * 24 * 60 * 60) / 45);
        System.out.println("Bir yıldaki nüfus artışı = " 
                + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45));
        System.out.println("Birinci yılın nüfusu = " 
                + (312032486 + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45) * 1));
        System.out.println("İkinci yılın nüfusu = " 
                + (312032486 + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45) * 2));
        System.out.println("Üçüncü yılın nüfusu = " 
                + (312032486 + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45) * 3));
        System.out.println("Dördüncü yılın nüfusu = " 
                + (312032486 + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45) * 4));
        System.out.println("Beşinci yılın nüfusu = " 
                + (312032486 + ((365 * 24 * 60 * 60) / 7 
                - (365 * 24 * 60 * 60) / 13 
                + (365 * 24 * 60 * 60) / 45) * 5));
        
    }
}
