import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       double totalPrice=0;
       double itemPrice=0;
       boolean response;


       do {
           itemPrice = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 9.99);
           totalPrice = itemPrice + totalPrice;
           response = SafeInput.getYNConfirm(in, "Do you have more items");
           if (response==true)
           {

           }
       }while (response);
        System.out.printf("The total cost is: %.02f " , totalPrice );
    }

}
