import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        float masa;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz mase obiektu: ");
        masa = dane.nextFloat();
        double ciezar=masa*9.8;
        if(ciezar>1000){
            System.out.println("Obiekt jest zbyt ciezki.");
        } else if (ciezar<10) {
            System.out.println("Obiekt jest zbyt lekki.");
        }
    }
}
