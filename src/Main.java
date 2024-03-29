import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();

        menuwindow(database);
    }

    static void menuwindow(Database database) {
        Database databases = database;
        Scanner sc = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("\n===ATM===");
            System.out.println("\nEnter 'log' to login");
            System.out.println("Enter 'reg' to register");
            System.out.println("Enter 'stop' to stop program");
            String m = sc.next();

            switch (m) {
                case "reg" -> {

                    registration(databases);
                }

                case "log" -> {
                    authorization(databases);
                }

                case "stop" -> {
                    System.exit(0);
                }

                case "test" -> {
                    myMethod();
                }

                default -> {
                    System.out.println("Unknown command, try again!");
                }
            }
        }
    }
    static void registration(Database databases){
        Database database = databases;

        database.addClient();
        System.out.println("Success registration!");
    }

    static void authorization(Database databases){
        Scanner sc = new Scanner(System.in);
        Database database = databases;

        boolean check = true;
        boolean isverif = true;

        check = true;
        while(check){
            System.out.print("\nLogin into account by number: ");
            String acNum = sc.next();
            System.out.print("Enter PIN: ");
            String pinCode = sc.next();

            boolean accountFound = false;

            for(BankAccountNumber db : database.allAccounts){
                if((Objects.equals(db.getAccountNumber(), acNum)) && (Objects.equals(db.getPinCode(), pinCode))){
                    check = false;
                    isverif = true;
                    accountFound = true;

                    if(db instanceof CityBankAccount){
                        while(isverif){
                            System.out.println("\n===CityBank===");
                            System.out.println("\nChoose operation:");
                            System.out.println("\nPress [1] for cash withdraw");
                            System.out.println("Press [2] to view balance");
                            System.out.println("Press [3] to change pin");
                            System.out.println("Press [4] to insert cash into account");
                            System.out.println("Press [5] to view account data");
                            System.out.println("Press [6] to exit");
                            int n = sc.nextInt();

                            switch (n){
                                case 1 -> {
                                    System.out.print("Withdrawal amount: ");
                                    int nummins = sc.nextInt();
                                    db.creditBalance(nummins);
                                    System.out.println("You have: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("You have: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                }
                                case 3 -> {
                                    System.out.print("Enter new pin: ");
                                    String newPin = sc.next();
                                    db.setPinCode(newPin);
                                    System.out.println("Pin successfully changed");
                                    System.out.println();
                                    break;
                                }
                                case 4 -> {
                                    System.out.print("Enter amount to add: ");
                                    int plus = sc.nextInt();
                                    db.debetBalance(plus);
                                    System.out.println("Your current balance: " + db.totalBalance());
                                    System.out.println();
                                    break;
                                }
                                case 5 -> {
                                    System.out.println("CityBank account info");
                                    System.out.println(db.accountData());
                                    break;
                                }
                                case 6 -> {
                                    isverif = false;
                                    check = false;
                                }
                                default -> {
                                    System.out.println("Unknown key, try again!");
                                    break;
                                }
                            }
                        }
                    }
                    else if(db instanceof NationalBankAccount){
                        while (isverif){
                            System.out.println("\n===NationalBank===");
                            System.out.println("\nChoose operation:");
                            System.out.println("\nPress [1] for cash withdraw");
                            System.out.println("Press [2] to view balance");
                            System.out.println("Press [3] to exit");
                            int n = sc.nextInt();

                            switch (n){
                                case 1 -> {
                                    System.out.print("Enter amount to withdraw: ");
                                    int nummins = sc.nextInt();
                                    db.creditBalance(nummins);
                                    System.out.println("You have:" + db.totalBalance());
                                    System.out.println();
                                    break;
                                }

                                case 2 -> {
                                    System.out.print("Your balance is: " + db.totalBalance());
                                    break;
                                }

                                case 3 -> {
                                    isverif = false;
                                    check = false;
                                }

                                default -> {
                                    System.out.println("Unknown key, try again!");
                                }
                            }
                        }
                    }
                    break;
                }
            }
            if(!accountFound){
                System.out.println("\nAccount info is incorrect or not found, try again!");
                check = false;
                break;
            }
        }
    }

    static void myMethod(){
        System.out.println("Method separation");
    }
}
