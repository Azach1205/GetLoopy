public class Task7
{
    public static void main(String[] args)
    {
        //Outer loop for the rows
        for (int i = 1; i <= 5; i++)
        {
            //Inner loop for the dots
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            //Move to next line
            System.out.println();
        }
    }
}