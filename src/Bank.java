public class Bank {
    String bankName;
    int bankCode;
    BankAccount account1;
    BankAccount account2;
    Bank(String bankName, int bankCode){
        this.bankName=bankName;
        this.bankCode=bankCode;
    }
    public void setAccounts(BankAccount a, BankAccount b){
        account1=a;
        account2=b;
    }
    public double getTotalBalance(){
        return account1.getBalance()+account2.getBalance();
    }

    public String getBankInfo(){
        return "Bank name: "+bankName+", Bank code: "+bankCode+"\nAccount 1: "+account1.getAccountInfo()+"\nAccount 2: "+account2.getAccountInfo();
    }

    public String getBankName(){
        return bankName;
    }
}
