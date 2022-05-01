import java.util.Scanner;

public class DevTest
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(in,"What is your favorite integer");
        favDouble = SafeInput.getDouble(in,"What is your favorite double");
        System.out.println("Your favorite integer is " + favInt +" and your favorite double is "+ favDouble);

        int year;
        int month;
        int day;
        int hour;
        int min;
        year = SafeInput.getRangedInt(in,"What year were you born",1950,2010);
        month = SafeInput.getRangedInt(in,"What month were you born",1,12 );
        switch (month)
        {
            case 4,6,9,11:
                day = SafeInput.getRangedInt(in,"What day were you born",1,30);
                break;
            case 1,3,5,7,8,10,12:
                day = SafeInput.getRangedInt(in,"What day were you born",1,31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in,"What day were you born",1,28);
                break;
        }
        hour =  day = SafeInput.getRangedInt(in,"What hour were you born",1,24);
        min =  day = SafeInput.getRangedInt(in,"What min were you born",1,59);
        System.out.println("You were born on, "+ year + "(year), " + month + "(month), " + day + "(day), "+ hour + "(hour), "+min + "(min)");

        double itemPrice;
        double totalPrice= 0;
        boolean moreItem = true;
        while(moreItem)
        {
            itemPrice = SafeInput.getRangedDouble(in,"What is the price of the item", .50,9.99);
            totalPrice = totalPrice + itemPrice;
            moreItem = SafeInput.getYNConfirm(in,"Do you have more items");
        }
        System.out.println("The total of your items is: " + totalPrice);

        String ssn;
        String studentId;
        ssn = SafeInput.getRegExString(in,"What is your Social Security Number?","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your Social Security Number: " +ssn);
        studentId = SafeInput.getRegExString(in, "What is your Student Id",("(M|m)\\d{5}"));
        System.out.println("Your Student Id is: " +studentId);
        String menuChoice;
        boolean menuDone = false;
        do
        {
            displayMenu();
            menuChoice = SafeInput.getRegExString(in, "Enter your Choice", "[OoSsVvQq]");
            switch(menuChoice)
            {
                case "O":
                case "o":
                    System.out.println("You have chosen Open");
                    break;
                case "S":
                case "s":
                    System.out.println("You have chosen Save");
                    break;
                case "V":
                case "v":
                    System.out.println("You have chosen View");
                    break;
                case "Q":
                case "q":
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;

            }
        }while (!menuDone);

         */
        SafeInput.prettyHeader("Hello World");

    }


    private static void displayMenu()
    {
        System.out.println("O - Open\n S - Save\n V - View\n Q - Quit");
    }

}
