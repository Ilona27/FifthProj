import org.testng.annotations.Test;

import java.util.Scanner;
public class ReplacementOfFactorial {
    @Test
    public static void main(String[] args) {
        System.out.print("Input some meaning of positives integer number: ");
        Scanner People = new Scanner(System.in);
        int n = People.nextInt();
        int mult = 1;
        for(int i = 1; i <= n; i++){
            mult = mult*i;
        }
        System.out.println(mult);
    }


}
