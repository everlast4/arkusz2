import java.util.Scanner;
public class zadanie1 {
        public static void main(String[] args) {
            int liczba;
            Scanner dane = new Scanner(System.in);
            System.out.println("Podaj liczbe: " );
            liczba = dane.nextInt();
            System.out.print("Liczba rzymska podanej liczby to: ");
            switch (liczba){
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;

            }
            if(liczba>10)
                System.out.println("Błąd");

        }

    }

