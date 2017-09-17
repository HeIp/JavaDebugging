import java.util.Scanner;

public class PythagoreanCalc
{
    public static void main(String[] args)
    {
        System.out.println("Daniel, this program calculates the length of the missing side" +
        "in right angle triangle");
        System.out.println("Put the length of one side: ");
        Scanner response = new Scanner(System.in);
        double side1 = response.nextInt();
        System.out.println("Put the length of the next side: ");
        double side2 = response.nextInt();
        double side3 = Math.sqrt( (Math.pow(side1,2)) + (Math.pow(side2,2)) );
        System.out.printf("The Third side length is: %.2f", side3);

    }
}
