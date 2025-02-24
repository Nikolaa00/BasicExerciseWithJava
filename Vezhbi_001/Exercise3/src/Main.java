import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vnesi tri broevi koj ke  predstavuvaat strani na triagolnik!");
        Scanner scanner =new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int numberSecond=scanner.nextInt();
        int numberThird=scanner.nextInt();

        String anwser=(numberThird+numberSecond>numberOne&&numberThird+numberOne>numberSecond&&numberSecond+numberOne>numberThird)?("Moze da se nacrta!"):("Nemozhe da se nacrta!");
        System.out.println(anwser);

    }
}