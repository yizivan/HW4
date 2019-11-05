import java.util.Scanner;

public class p260_9
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private Integer choco=0, coupon=0, money;
    public void run()
    {
        System.out.println();
        System.out.println("This is the question 9 from page 260.");
        System.out.println("Please enter how much money you have in your hand.");
        money = keyboard.nextInt();
        while (money > 0 || coupon >= 6 )
        {
            if (money > 0)
            {
                choco++;
                money--;
                coupon++;
            }
            if (coupon >= 6)
            {
                choco++;
                coupon = coupon - 5;
            }
        }
        System.out.println("we could have consumd " + choco + " chocolates, and still have " + coupon + " coupon left.");
        keyboard.close();
    }
}