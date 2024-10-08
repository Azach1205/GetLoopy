public class Task6
{
    public static void main(String[] args)
    {
        //Outer loop for the rows
        for (int i = 5; i >= 1; i--)
        {
            //Inner loop for printing the dots
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //Move to the next line
            System.out.println();
        }
    }
}