import java.util.Scanner;

public class p129_2
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String fs, ss, ns;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 2 from page 129. Enter 2 String then showing and combin together. (different lines)");
        fs = keyboard.nextLine();
        ss = keyboard.nextLine();
        System.out.println(fs + " " + fs.length());
        System.out.println(ss + " " + ss.length());
        ns = fs + " " + ss;
        System.out.println(ns + " " + ns.length());
        //keyboard.close();
    }
    
}   