import java.util.Scanner;

public class p193_4
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String sen;
    private int resultq, resulte;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 4 from page 193.");
        System.out.println("Please enter a sentence.");
        sen = keyboard.nextLine();
        resultq = sen.indexOf("?");
        resulte = sen.indexOf("!");
        if ((resultq == sen.length()-1) && (sen.length() % 2 == 0))
        {
            System.out.println("Yes");
        }
        else if ((resultq == sen.length()-1) && (sen.length() % 2 == 1))
        {
            System.out.println("No");
        }
        else if (resulte == sen.length()-1)
        {
            System.out.println("Wow");
        }
        else 
        {
            System.out.println("You always say \"" + sen + "\"");
        }
    }
}