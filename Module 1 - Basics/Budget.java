import java.util.Scanner;
public class Budget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the budget application!\nAnswer questions to find your disposable income!");

        // User's name
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        // System.out.println(name);

        // Users monthly income
        System.out.println("\nWhat is your income? Please input a whole number!");
        int monthlyIncome = scan.nextInt();
        // System.out.println(monthlyIncome);

        // Users monthly rent
        System.out.println("\nWhat is your rent? Please input a whole number!");
        double monthlyRent = scan.nextDouble();

        //users monthly savings projection
        System.out.println("\nHow much would you like to save each month?");
        double monthlySavings = scan.nextDouble();
        scan.close();
        System.out.println("\nBudget Summary for " + name);
        System.out.println("Monthly Income: " + monthlyIncome);
        System.out.println("Monthly Expenses: " + (monthlyRent + monthlySavings));
        System.out.println("\nTotal Disposable Income: " + (int)(monthlyIncome - (monthlyRent + monthlySavings)));
        


    }
}
