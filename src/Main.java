public class Main {
    public static void main(String[]args){
        BankAccount eyal=new BankAccount("Eyal", 10000);
        BankAccount omer=new BankAccount("Omer", 5000);
        System.out.println(eyal.getAccountId());
        System.out.println(omer.getAccountId());
        eyal.deposit(500);
        omer.withdraw(200);
        eyal.transferTo(omer,300);
        eyal.withdraw(20000);
        System.out.println(eyal.getBalance());
        System.out.println(eyal.getAccountInfo());
        System.out.println(omer.getAccountInfo());
        System.out.println(BankAccount.getTotalAccounts());
        System.out.println(BankAccount.getNextAccountId());
        BankAccount yotam=new BankAccount("Yotam", 15000);
        System.out.println(yotam.getAccountId());
        eyal.deposit(-100);
        System.out.println(eyal.getBalance());
        Bank discount=new Bank("Discount", 1296);
        discount.setAccounts(eyal,omer);
        System.out.println(discount.getBankInfo());
        System.out.println(discount.getTotalBalance());
    }
}
