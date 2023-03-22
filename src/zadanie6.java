import java.util.Scanner;

public class zadanie6 {
    public static final String  = "ilośc: ";

    public static void main(String[] args) {
        float sekundy;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz sekundy: ");
        sekundy = dane.nextFloat();

        if(sekundy<3600){
            float minuta=sekundy/60;
            System.out.println("Ilosc minut podanych sekund: " + minuta);
        } else if (sekundy<86400) {
            float godzina=sekundy/3600;
            System.out.println("Ilosc godzin podanych sekund: " + godzina);
        }else {
            float dni=sekundy/86400;
            System.out.println("Ilosc dni podanych sekund" + dni);
        }
    }
}