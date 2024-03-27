public interface BankAccountNumber {
    String getAccountNumber();
    String getPinCode();
    String setPinCode(String pinCode);
    int totalBalance();
    void creditBalance(int credit);
    void debetBalance(int debet);
    String accountData();
}
