public class BankAccount {
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive=true;
    private static int nextId=1000;
    private static int totalAccounts;
   BankAccount(String ownerName){
        this.ownerName=ownerName;
        accountId=nextId++;
        balance=0;
        totalAccounts++;
    }

    BankAccount(String ownerName, double initialBalance){
        this.ownerName=ownerName;
        if (initialBalance <= 0) {
            balance=0;
        }
        else{
            balance=initialBalance;
        }
        accountId=nextId++;
        totalAccounts++;
    }

    public boolean deposit(double amount){
       if(isActive){
           if(isValidAmount(amount)) {
               balance += amount;
               return true;
           }
           else{
               System.out.println("Can only deposit positive amount");
           }
       }
       else{
           System.out.println("The account you requested deposit for is inactive");
       }
       return false;
    }

   public boolean withdraw(double amount){
        if(isActive){
            if(amount<=balance){
                if(isValidAmount(amount)) {
                    balance -= amount;
                    return true;
                }
                else{
                    System.out.println("Cannot withdraw non-positive amount");
                }
            }
            else{
                System.out.println("Requested amount is bigger than balance");
            }
        }
        else{
            System.out.println("The account you requested to withdraw from is inactive");
        }
        return false;
    }

    public void transferTo(BankAccount destination, double amount){
       if(withdraw(amount)){
           destination.deposit(amount);
       }

    }

    public boolean closeAccount(){
       if(isActive){
           if(balance==0){
               isActive=false;
               return true;
           }
           else{
               System.out.println("Cannot close an account with non zero balance");
           }
       }
       else{
           System.out.println("The account is already closed");
       }
       return false;
    }

    public String getAccountInfo(){
        return "account number: " + accountId+", owner name: "+ownerName+", balance: "+balance+", account mode: "+(isActive? "Active":"in active");
    }

    public static int getTotalAccounts(){
       return totalAccounts;
    }

    public static boolean isValidAmount(double amount){
       if(amount>0){
           return true;
       }
       return false;
    }

    public static int getNextAccountId(){
       return nextId;
    }

    public double getBalance(){
       return balance;
    }

    public int getAccountId(){
       return accountId;
    }

}
