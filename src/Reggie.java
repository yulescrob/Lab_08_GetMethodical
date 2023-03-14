import java.util.Scanner;
public class Reggie {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String SSN;
        String MNumber;
        String menuResponse;
        String menu = " 0-Open S-Save V-View Q-Quit";

        SSN= SafeInput.getRegExString(in, "Enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        MNumber  = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{5}");
        System.out.println("Menu: " + menu);
        menuResponse = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");

    }

}
