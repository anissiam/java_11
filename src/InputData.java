import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {


        int x = 2022;

        System.out.println();
        System.out.println(x / 100);
        System.out.println(x / 1000);
        System.out.println(x / 1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("n1");
        int n1 = scanner.nextInt();

        System.out.println("n2");
        int n2 = scanner.nextInt();

        System.out.println("n3");
        int n3 = scanner.nextInt();

        System.out.println("n4");
        int n4 = scanner.nextInt();


        int ava = (n1 + n2 + n3 + n4) / 4;
        System.out.println(ava);

        /*System.out.println("plz enter first santence");
        String s1 = scanner.nextLine();

        System.out.println("plz enter sec santence");
        String s2 = scanner.nextLine();

        int l = s1.concat(s2).length();
        System.out.println(l);*/

        //read , in , input , scanner
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the year");
        String y = scanner.nextLine();

        System.out.println(y.charAt(0));
        System.out.println(y.charAt(1));
        System.out.println(y.charAt(2));
        System.out.println(y.charAt(3));*/

      /*  Scanner input = new Scanner(System.in);//instance/object from Scanner named input
        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println("Age is " + age);*/


        Scanner input = new Scanner(System.in);
        /*System.out.println("Plz enter the number");
        int num = input.nextInt();

        System.out.println("The num is " + num);*/
       /* System.out.println("Plz enter your name ");
        String name = input.nextLine();

        System.out.println(name.toUpperCase());
*/

      /*  System.out.println("Plz enter first name");
        String fName = input.nextLine();

        System.out.println("Plz enter last name ");
        String lName = input.nextLine();

        System.out.println("Plz enter age");
        int age = input.nextInt();

        System.out.println(fName.concat(" " + lName) + " " + age);*/


        /*System.out.println("Plz enter the mark");
        int mark = input.nextInt();

        input.nextLine();

        System.out.println("Plz enter the name");
        String name = input.next();

        String name1 = input.nextLine();
        System.out.println(name1);

        System.out.println(mark + "  " + name);
*/
    }
}
