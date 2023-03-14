import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth=0;
        birthMonth = getRangedInt(in, "Enter your birth month ", 1, 12);
        System.out.println("Birth month is " + birthMonth);
    }
    private static int getRangedInt(Scanner pipe, String prompt, int lo, int hi)
    {
        int result = 0;
        boolean done = false;
        String trash="";
        do {
            System.out.print(prompt + "[" + lo + " - " + hi + "]: ");
            if (pipe.hasNextInt())
            {
                result = pipe.nextInt();
                pipe.nextLine(); //clear buffer
                if (result >= lo && result <= hi)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer [" + lo + " - " + hi + "]: " + trash);

            }
        }while (!done);
        return result;
    }
}