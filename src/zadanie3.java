import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        float wzrost, waga;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj swoj wzrost (w metrach): ");
        wzrost = dane.nextFloat();
        System.out.println("Podaj swoja wage: ");
        waga = dane.nextInt();
        float wzr1=wzrost*wzrost;
        double bmi = waga/wzr1;
        if (bmi>25) {
            System.out.println("Masz nadwage.");
        } else if (bmi<18.5) {
            System.out.println("Masz niedowage.");
        } else {
            System.out.println("Twoja waga jest w normie.");
        }

    }
}