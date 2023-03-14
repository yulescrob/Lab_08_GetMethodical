import java.util.Random;
import java.util.Scanner;

public class SMDivideAndConquer {
    static String menu = "H - Hello M - Mischief F - Fortune Q - Quit";
    //have static string outside so it is not local
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String menuChoice = "";

        do
        {
            //display menu
            displayMenu();
            menuChoice = in.nextLine();
            menuChoice = menuChoice.toUpperCase();
            switch (menuChoice)
            {
                case "M":
                    System.out.println("\nWhat did the Vampire Nerd Take?\nHe took a byte!");

                break;
                case "H":
                    helloDisplay();
                break;
                case "F":
                    getLuckyNumber();

                break;
                case "Q":
                    System.out.println("Goodbye!!!");
                    System.exit(0); //quits without error

                break;
            }

        }while (!done);
    }

    private static void getLuckyNumber()
    {
        Random rnd = new Random();
        int lucky = rnd.nextInt(100)+1; //1-100
        System.out.println("Your lucky number for today is: " + lucky);
    }

    private static void helloDisplay()
    {
        for (int h=1; h<1000; h++);
        {
            System.out.println("HELLO!!!");
        }
    }

    private static void displayMenu()
    {
        System.out.println(menu);
    }
}
