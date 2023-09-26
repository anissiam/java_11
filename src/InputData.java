import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//instance/object from Scanner named input
        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println("Age is " + age);
    }
}
