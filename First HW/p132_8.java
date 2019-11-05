import java.util.Scanner;

public class p132_8
{
    /*
        author Yiyang Shi.
    */
    private Scanner keyboard = new Scanner(System.in);
    private double WBMR, MBMR, numofcalofchobar, height, weight;
    private int age;
    public void run()
    {
        System.out.println();
        System.out.println("This is question 8 from page 132.");        
        System.out.println("please enter the weght(by pound), height(by inch),and age(by year) about the person who you want to check.(using space to divide those imformation)");
        weight = keyboard.nextDouble();
        height = keyboard.nextDouble();
        age = keyboard.nextInt();
        // These are two formula of WBMR and MBMR.
        WBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        MBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        // This is the name constant of the number of calories in a typical chocolar bar.
        numofcalofchobar = 230;
        System.out.println("If information is from a woman. The number of chocolate bars this woman would need to consume to maintain her weight : "+String.format("%.2f", WBMR/numofcalofchobar));
        System.out.println("If information is from a man. The number of chocolate bars this man would need to consume to maintain his weight : "+String.format("%.2f", MBMR/numofcalofchobar));
 
    }
}