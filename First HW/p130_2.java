import java.util.Scanner;

public class p130_2
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String text;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 2 from page 130.");
        System.out.println("Enter a line of text.");
        text = keyboard.nextLine();
        text = text.replaceFirst("hate","love");
        System.out.println("I have rephrased that line to read:");
        System.out.println(text);
        //keyboard.close();
    }
}