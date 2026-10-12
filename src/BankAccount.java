public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber,String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;


    }


    public int getAccountNumber(){
        return accountNumber;
    }


    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    //Deposit money

    public void deposit(double amount){


        //Uncheched custom exception
        if(amount <= 0){
            throw new InvalidAmountException("Deposit amount must be grater than zero");
        }

        balance = balance + amount;

        System.out.println("rs " + amount + "deposited succesfully");
    }

    public void withdraw(double amount) throws InsufficientBalanceException {


        //Uncheked custom exception
        if (amount <= 0) {
            throw new InvalidAmountException("withdrawal amount must be grater than zero");
        }

        //cheked exception
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance ");
        }

        balance = balance - amount;

        System.out.println(
                "₹" + amount + " withdrawn successfully"
        );
    }

    public void displayAccount() {

        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("----------------------------");
    }



}


