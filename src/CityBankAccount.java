public class CityBankAccount implements BankAccountNumber{
    protected String name;
    protected String surname;
    protected int balance;
    protected String accountNumber;
    protected String pinCode;

    public CityBankAccount(String name, String surname, String accountNumber, int balance, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBalance() {
        return balance;
    }







    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public String setPinCode(String newCode) {
        pinCode = newCode;
        return newCode;
    }

    @Override
    public int totalBalance() {
        return getBalance();
    }

    @Override
    public void creditBalance(int credit) {
        balance = balance - credit;
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "Name: " + getName() + " Surname: " + getSurname() + ", Account Number: " + accountNumber + ", Pin Code: " + pinCode + ", Balance:" + balance;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
