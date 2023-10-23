import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vnesi broj koj ke pretstavuva osnovica na plata");

        Scanner scanner = new Scanner(System.in);

        double brojNaOsnovicaNaPlata = scanner.nextDouble();
        double da = brojNaOsnovicaNaPlata * 0.8;
        double hra = brojNaOsnovicaNaPlata * 0.2;
        double vkupnaPlata;

        if (brojNaOsnovicaNaPlata <= 10000) {
            vkupnaPlata = (brojNaOsnovicaNaPlata + (da / 100) * 80 + (hra / 100 * 20));
           //znakot <  znachi  za pomala plata od 10000
            System.out.println("Vkupna plata <: " + vkupnaPlata);
        }
        else if(brojNaOsnovicaNaPlata > 10000 && brojNaOsnovicaNaPlata <= 20000) {
            vkupnaPlata = (brojNaOsnovicaNaPlata + (da / 100) * 90 + (hra / 100 * 25));
            //znakot /znachi   za  plata megu  10001 i 20000
            System.out.println("Vkupna plata /: " + vkupnaPlata);
        }
        else if(brojNaOsnovicaNaPlata > 20000) {
            vkupnaPlata = (brojNaOsnovicaNaPlata + (da / 100) * 95 + (hra / 100 * 30));
           // znakot > znachi za plata pogolema od 20001
            System.out.println("Vkupna plata >: " + vkupnaPlata);
        }
    }
}