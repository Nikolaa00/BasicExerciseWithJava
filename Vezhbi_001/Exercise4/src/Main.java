import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vnesi broj koj ke pretstavuva osnovica na plata");

        Scanner scanner = new Scanner(System.in);

        double numberOfBaseSalery = scanner.nextDouble();
        double da = numberOfBaseSalery * 0.8;
        double hra = numberOfBaseSalery * 0.2;
        double totalSalery;

        if (numberOfBaseSalery <= 10000) {
            totalSalery = (numberOfBaseSalery + (da / 100) * 80 + (hra / 100 * 20));
            System.out.println("Vkupna plata za osnovna  plata pomala od 10000: " + totalSalery);
        }
        else if(numberOfBaseSalery > 10000 && numberOfBaseSalery <= 20000) {
            totalSalery = (numberOfBaseSalery + (da / 100) * 90 + (hra / 100 * 25));
            System.out.println("Vkupna plata  za osnovna plata megu  10001 i 20000: " + totalSalery);
        }
        else if(numberOfBaseSalery > 20000) {
            totalSalery = (numberOfBaseSalery + (da / 100) * 95 + (hra / 100 * 30));
            System.out.println("Vkupna plata  za osnovna plata pogolema od 20001: " + totalSalery);
        }
    }
}