import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
    public ArrayList<BankAccountNumber> allAccounts = new ArrayList<>();

    public Database() {
    }

    public void addClient(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int numAccs = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numAccs; i++){
            System.out.print("\nEnter account type CityBank(1)/NationalBank(2): ");
            int accountType = sc.nextInt();
            sc.nextLine();

            if(accountType == 1){
                System.out.println("\n===CityBank account registration===");

                System.out.print("\nEnter name: ");
                String name = sc.next();

                System.out.print("Enter surname: ");
                String surname = sc.next();

                System.out.print("Enter account number: ");
                String accountNumber = sc.next();

                System.out.print("Enter pin code: ");
                String pinCode = sc.next();

                System.out.print("Enter balance: ");
                int balance = sc.nextInt();
                sc.nextLine();

                allAccounts.add(new CityBankAccount(name, surname, accountNumber, balance, pinCode));
            }
            if(accountType == 2){
                System.out.println("\n===NationalBank account registration===");

                System.out.print("\nEnter name: ");
                String name = sc.next();

                System.out.print("Enter account number: ");
                String accountNumber = sc.next();

                System.out.print("Enter pin code: ");
                String pinCode = sc.next();

                System.out.print("Enter balance: ");
                int balance = sc.nextInt();
                sc.nextLine();

                allAccounts.add(new NationalBankAccount(name, balance, accountNumber, pinCode));
            }
        }
    }
}

