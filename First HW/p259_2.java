import java.util.Scanner;

public class p259_2
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String word, fword;
    private Integer counter = 0;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 2 from page 259.");
        System.out.println("Please start entering words.");
        word = keyboard.nextLine();
        word = word.toLowerCase();   
        while ( !word.equals("quit") )
        {
            word = word.substring(1, word.length());
            StringBuffer bword = new StringBuffer(word);
            bword.reverse();
            fword =bword.toString();
            if (word.equals(fword))
            {
                counter++;
                System.out.println("This word has this property.");
            }
            else
                System.out.println("This word doesn't have this property.");
            word = keyboard.nextLine();
            word = word.toLowerCase();
        }
        System.out.println("There were total " + counter + " words having that property.");
        //keyboard.close();
    }
}