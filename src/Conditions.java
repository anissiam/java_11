import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Plz enter the num");
        int num = input.nextInt();

        if (num==0){
            System.out.println("Zero");
            return;
        }

        if (num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


        /*System.out.println("Plz enter the mark");
        int mark = input.nextInt();

        if (mark>100 ||mark<0 ){
            System.out.println("Not valid");
            return;
        }


        if (mark >= 50) {//nested if
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

        }*/

       /* if (mark<100){
            if (mark >= 50) {//nested if
                System.out.println("Passed");
            }else {
                System.out.println("Failed");

            }
        }else {
            System.out.println("Not valid ");

        }*/


        System.out.println("Done");

    }
}
