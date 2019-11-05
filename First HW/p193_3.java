import java.util.Scanner;
import java.util.Arrays;

public class p193_3
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String senten[] = new String[3];
    
    public void run()
    {
        System.out.println();
        System.out.println("This is question 3 from page 193.");
        System.out.println("Please enter 3 strings in 3 lines.");
        senten[0] = keyboard.nextLine();
        senten[1] = keyboard.nextLine();
        senten[2] = keyboard.nextLine();
        Arrays.sort(senten);
        System.out.println("This is the sencond string after being arranged lexicographically: ");
        System.out.println(senten[1]);
        //keyboard.close();
    }

}