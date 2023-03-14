import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);
        int day;
        boolean isLeapYear = false;
        if (((year%4 ==0) && (year%100 != 0))|| (year%400 ==0))
        {
            isLeapYear = true;
        }
        switch (month)
        {
            case 2:
                day = 28;
                if(isLeapYear)
                {
                    day =29;
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                day =30;
            break;
            default:
                day=31;
            break;

        }
        int dayOfBirth = SafeInput.getRangedInt(in, "Enter day of birth", 1, day);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of birth", 1,24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of birth", 1,59);
        System.out.printf("\nYou were born on %d/%d/%d and time %d:%d",month,dayOfBirth, year, hour,minute);
    }

}
