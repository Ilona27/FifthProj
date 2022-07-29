import org.testng.annotations.Test;

public class TrainingFive {
    @Test
    public void Stars(){
        for(int i = 0; i < 3; i++){
            for(int n = 0; n < 5; n++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
