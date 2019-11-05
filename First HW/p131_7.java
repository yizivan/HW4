import java.util.Scanner;

public class p131_7
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private double r, dp, gln;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 7 from page 131.");
        System.out.println("Please enter the the radius of the well casing in inches and the depth of the well in feet. (using space between them)");
        r = keyboard.nextDouble();
        dp = keyboard.nextDouble();
        r = r/12;
        gln = (Math.PI * r * r * dp) * 7.48;
        gln = Math.floor(gln);
        System.out.println("This well can contain about " + gln + " gallons of water.");
        if (gln > 250)
        {
            System.out.println("plenty for a family of 4 and no need to install a separate holding tank");
        }
        else
        {
            System.out.println("plenty for a family of 4 and need to install a separate holding tank");
        }
        //keyboard.close();
    }
}