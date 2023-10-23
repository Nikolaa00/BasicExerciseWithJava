import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vnesi tri broevi koj ke  predstavuvaat strani na triagolnik!");
        Scanner scanner =new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int numberSecond=scanner.nextInt();
        int numberThird=scanner.nextInt();
        boolean anwser=(numberThird+numberSecond>numberOne&&numberThird+numberOne>numberSecond&&numberSecond+numberOne>numberThird)? (true):(false);
        if (anwser){
            System.out.println("Moze da se nacrta!");
        }else {
            System.out.println("Nemozhe da se nacrta!");
        }



    }
}