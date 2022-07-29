
import java.util.Scanner;
public class Training {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name : ");
        String role = sc.nextLine();
        System.out.print("Input password : ");
        String role1 = sc.nextLine();
        if(role.equals("Admin") && role1.equals("12345")){
            System.out.println("You are authorized");
        }else {
            System.out.println("Welcome!");
        }



    }



    }

