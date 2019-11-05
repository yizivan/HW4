import java.util.Scanner;

public class p195_4
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private String data;
    private Integer day, month, year;
    private Boolean yb;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 4 from page 195.");
        System.out.println("Please enter a data. (mm/dd/yyyy)");
        data = keyboard.nextLine();
        month = Integer.valueOf(data.substring(0,2));
        day = Integer.valueOf(data.substring(3,5));
        year = Integer.valueOf(data.substring(6));
        //System.out.println(month + " " + day + " " +year);
        if (year >= 0)
        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                yb = true;
            else yb = false;

            if (month == 9 || month == 4 || month == 6 || month ==11)
            {
                if ( day <= 30 && day >=1 )
                    System.out.println("This data is valid.");
                else System.out.println("This data is not valid because days must be between 1 and 30.");
            }
            else if (month == 2)
            {
                if (( day <=29 && day >=1 && yb) || ( day <=28 && day >=1 && !yb))
                    System.out.println("This data is valid.");
                else if (yb)
                        System.out.println("This data is not valid because days must be between 1 and 29.");
                    else 
                        System.out.println("This data is not valid because days must be between 1 and 28.");
            }
            else if (month >= 1 && month <= 12)
            {
                if ( day <=31 && day>=1 )
                    System.out.println("This data is valid.");
                else System.out.println("This data is not valid because days must be between 1 and 31.");
            }
            else System.out.println("This data is not valid because months must be between 1 and 12.");
        }
        else System.out.println("This data is not valid because years must be positive.");
        //keyboard.close();
    }
}