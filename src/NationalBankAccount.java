public class NationalBankAccount implements BankAccountNumber{
    protected String fullName;
    protected int balance;
    protected String accountNumber;
    protected String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
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
        balance = balance - credit - 200;
    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return null;
    }







    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
