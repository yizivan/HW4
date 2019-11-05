import java.util.Scanner;

public class p130_4
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String s1, s2, clr, fd, am, name;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 4 from page 130.");
        s1 = "I had a dream that Name ate a Color Animal";
        s2 = "and said it taste like Food";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println("Please enter a favorite color, a favorite food, a favorite animal, and the first name of a friend or relative. (use space between them)");
        clr = keyboard.next();
        fd = keyboard.next();
        am = keyboard.next();
        name = keyboard.next();
        s1 = s1.replaceAll("Name", name);
        s1 = s1.replaceAll("Color", clr);
        s1 = s1.replaceAll("Animal", am);
        s2 = s2.replaceAll("Food", fd);
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        //keyboard.close();
    }
}