import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int menuOption;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];
        for (;true;) {
            System.out.println("Bank Menu : ");
            System.out.println("Please enter an option : ");
            System.out.println("(1): Add customer to the bank ");
            System.out.println("(2): Change customer's name ");
            System.out.println("(3): Check account balance ");
            System.out.println("(4): Modify account balance ");
            System.out.println("(5): Summary of all account ");
            System.out.println("(-1): Quit ");

            menuOption= sc.nextInt();
            if (menuOption == 1) {
                System.out.println("Bank Add customer menu");
                System.out.println("Please enter an account balance");
                double balance = sc.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please enter the account name");
                sc.nextLine();
                String name = sc.nextLine();
                accountNames[size] = name;
                System.out.println("Customer ID is : " + size);
                size = size + 1;
            }
            else if (menuOption == 2)
            {
                System.out.println("Bank Change name menu ");
                System.out.println("Please enter a customer Id to change there name");
                int index = sc.nextInt();
                System.out.println("Enter the customer's new name ?");
                sc.nextLine();
                accountNames[index] = sc.nextLine();
            }
            else if (menuOption == 3)
            {
                System.out.println("Bank Check balance menu");
                System.out.println("Please enter a customer ID to check the balance");
                int index = sc.nextInt();
                double balance = accountBalances[index];
                System.out.println(accountNames[index] + " have $ " + balance + " in account");
            }
            else if (menuOption == 4)
            {
                System.out.println("Bank Modify balance menu");
                System.out.println("Please enter your customer Id to modify your account balance");
                int index = sc.nextInt();
                System.out.println("Please enter the new balance");
                accountBalances[index] = sc.nextDouble();
            }
            else if (menuOption == 5)
            {
                System.out.println("Bank all customer Summary account menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in there account");
                }
                System.out.println("Bank has total $" + total + " in the branch");
            }
            else if (menuOption == -1)
            {
                System.exit(-1);
            }
            else
            {
                System.out.println("ERROR: Please select appropriate option");
            }
        }
    }
}