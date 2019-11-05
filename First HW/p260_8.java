public class p260_8
{
    /*
        author Yiyang Shi.
    */
    private Integer counter = 0, random;
    private Boolean number[] = new Boolean[10];
    public void run()
    {   
        System.out.println();
        System.out.println("This is qusetion 8 from page 260.");
        for (int i = 0; i < 10; i++)
        {
            number[i] = false;
        }
        do
        {
            random = (int)(Math.random()*10+1);
            if (!number[random - 1])
            {
                number[random - 1] = true;
                counter++;
                System.out.print(random + " ");
            }
        }
        while (counter < 3);
        System.out.println();
    }
    
}