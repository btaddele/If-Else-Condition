import java.util.Scanner;

public class ifElse {

        public static void main(String[] args) {
            int x;

            System.out.println("enter a number");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            if (x > 10)
            {
                System.out.println("Number is greater than 10.");
            }
            else if (x < 10)
            {
                System.out.println("Number is less than 10.");
            }
            else
                {
                System.out.println("equal to 10");
            }

            System.out.println("Application finished.");
        }

}
