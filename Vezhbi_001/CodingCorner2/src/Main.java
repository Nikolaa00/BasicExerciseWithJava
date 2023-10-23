import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Vnesi brend na avtomobil:");
        String brаnd = scanner.next();
       
        switch (brаnd) {
            case "Mercedes":
            case "Audi":
            case "BMW":
            case "Opel":
            case "Porshe":
                System.out.println("Germanija!\n");
                break;
            case "Renault":
            case "Peugeot":
            case "Citroen":
                System.out.println("France!\n");
                break;
            case "Mazda":
            case "Lexus":
            case "Toyota":
            case "Honda":
                System.out.println("Japan!\n");
                break;
            case "Alfa Romeo":
            case "Ferrari":
            case "Lamborghini":
            case "Fiat":
                System.out.println("Italy!\n");
                break;
            case "Jeep":
            case "Tesla":
            case "Cadillac":
                System.out.println("USA!\n");
                break;
            default:
                System.out.println("Nemam Drzhava za takov brend na avtomobil ili ne e brend.");

        }
    }
}