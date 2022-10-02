import java.util.Scanner;

public class Main

{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius = 0.0, fahrenheit = 0.0;

        System.out.print("Enter a valid Celsius temperature value : ");

        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();

            fahrenheit = (celsius * 1.8) + 32;

            if (celsius == 0)
            {
                System.out.println("Input temperature value is at freezing point in Fahrenheit : " + fahrenheit);
            }
            else if (celsius == 100)
            {
                System.out.println("Input temperature value is at boiling point in Fahrenheit : " + fahrenheit);
            }
            else
            {
                System.out.println("Value of temperature in Fahrenheit : " + fahrenheit);
            }

        }
        else
        {

            System.out.println("Input Celsius temperature value is not valid");

        }

    }

}