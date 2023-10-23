import java.util.Scanner;

public class Exercise001 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi broj  koj e vo rangot[1,12]:");
        number = scanner.nextInt();

        while ((number <= 0) || (number > 12)) {
            System.out.println("Vnesovte broj koj ne e vo rangot[1,12],probajte poftorno:");
            number = scanner.nextInt();
        }
        
        System.out.println("Vneseniot broj e:" + number);
        
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31");
                break;
            case 2:
                System.out.println(" 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30");
                break;
        }
    }
}