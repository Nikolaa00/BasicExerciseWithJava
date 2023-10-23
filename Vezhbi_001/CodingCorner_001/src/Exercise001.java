import java.util.Scanner;

public class Exercise001 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi broj  koj e vo rangot[1,12]:");
        number=scanner.nextInt();
        while((number<=0) ||(number>12)){
            System.out.println("Vnesovte broj koj ne e vo rangot[1,12],probajte poftorno:");
            number=scanner.nextInt();
        }
        System.out.println("Vneseniot broj e:"+number);
       switch (number){
           case 1:
               System.out.println("Јануари има 31");
               break;
           case 2:
               System.out.println("Фебруари има 28");
               break;
           case 3:
               System.out.println("Март има 31");
               break;
           case 4:
               System.out.println("Април има 30");
               break;
           case 5:
               System.out.println("Мај има 31");
               break;
           case 6:
               System.out.println("Јуни има 30");
               break;
           case 7:
               System.out.println("Јули има 31");
               break;
           case 8:
               System.out.println("Август има 31");
               break;
           case 9:
               System.out.println("Септември има 30");
               break;
           case 10:
               System.out.println("Октомври има 31");
               break;
           case 11:
               System.out.println("Ноември има 30");
               break;
           case 12:
               System.out.println("Декември има 31");
               break;



       }
    }
}