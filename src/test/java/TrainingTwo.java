import org.testng.annotations.Test;

import  java.util.Scanner;
public class TrainingTwo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your email: ");
        String email = scanner.nextLine();
        System.out.print("Input your password: ");
        String pass = scanner.nextLine();
        if (email.equals("Ilona.kohan2003@gmail.com") && pass.equals("27112003")) {
            System.out.println("You are authorized");
        } else{
            System.out.println("Welcome");
        }



    }
}

