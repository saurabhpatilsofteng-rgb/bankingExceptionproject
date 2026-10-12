public class TransactionService {

    private BankAccount[] accounts;

    public TransactionService(BankAccount[] accounts){
        this.accounts = accounts;
    }

    public BankAccount findAccount(int accountNumber) throws  AccountNotFoundException{

        for(BankAccount account : accounts){

            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }

        throw new AccountNotFoundException("Account " + accountNumber + " not found");

    }

    public void transfer(
            int fromAccount,
            int toAccount,
            double amount) throws Exception{

        BankAccount sender = findAccount(fromAccount);

        BankAccount receiver = findAccount(toAccount);

        sender.withdraw(amount);
        receiver.deposit(amount);

        System.out.println("Transfer successful");

    }

}
