//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Create bank accounts
        BankAccount account1 =
                new BankAccount(
                        101,
                        "Saurabh",
                        10000
                );

        BankAccount account2 =
                new BankAccount(
                        102,
                        "Rahul",
                        5000
                );

        BankAccount[] accounts = {
                account1,
                account2
        };

        TransactionService service =
                new TransactionService(accounts);

        System.out.println("===== BANKING APPLICATION =====");

        // --------------------------------
        // 1. Display account
        // --------------------------------

        account1.displayAccount();
        account2.displayAccount();

        // --------------------------------
        // 2. Deposit
        // --------------------------------

        try {

            System.out.println("\n===== DEPOSIT =====");

            account1.deposit(2000);

            System.out.println(
                    "Current Balance: ₹"
                            + account1.getBalance()
            );

        } catch (InvalidAmountException e) {

            System.out.println(
                    "Deposit Error: "
                            + e.getMessage()
            );

        } finally {

            System.out.println(
                    "Deposit operation completed"
            );
        }

        // --------------------------------
        // 3. Withdraw
        // --------------------------------

        try {

            System.out.println("\n===== WITHDRAW =====");

            account1.withdraw(3000);

            System.out.println(
                    "Current Balance: ₹"
                            + account1.getBalance()
            );

        } catch (InsufficientBalanceException e) {

            System.out.println(
                    "Withdrawal Error: "
                            + e.getMessage()
            );

        } finally {

            System.out.println(
                    "Withdrawal operation completed"
            );
        }

        // --------------------------------
        // 4. Insufficient balance
        // --------------------------------

        try {

            System.out.println(
                    "\n===== INVALID WITHDRAW ====="
            );

            account1.withdraw(50000);

        } catch (InsufficientBalanceException e) {

            System.out.println(
                    "Exception: "
                            + e.getMessage()
            );
        }

        // --------------------------------
        // 5. Invalid amount
        // --------------------------------

        try {

            System.out.println(
                    "\n===== INVALID AMOUNT ====="
            );

            account1.deposit(-500);

        } catch (InvalidAmountException e) {

            System.out.println(
                    "Exception: "
                            + e.getMessage()
            );
        }

        // --------------------------------
        // 6. Account not found
        // --------------------------------

        try {

            System.out.println(
                    "\n===== SEARCH ACCOUNT ====="
            );

            BankAccount account =
                    service.findAccount(999);

            account.displayAccount();

        } catch (AccountNotFoundException e) {

            System.out.println(
                    "Exception: "
                            + e.getMessage()
            );
        }

        // --------------------------------
        // 7. Transfer money
        // --------------------------------

        try {

            System.out.println(
                    "\n===== MONEY TRANSFER ====="
            );

            service.transfer(
                    101,
                    102,
                    2000
            );

        } catch (Exception e) {

            System.out.println(
                    "Transfer Error: "
                            + e.getMessage()
            );
        }

        // --------------------------------
        // 8. Final account balance
        // --------------------------------

        System.out.println(
                "\n===== FINAL BALANCE ====="
        );

        account1.displayAccount();
        account2.displayAccount();

        // --------------------------------
        // 9. Try-with-resources
        // --------------------------------

        System.out.println(
                "\n===== TRY WITH RESOURCES ====="
        );

        try (
                BankStatement statement =
                        new BankStatement()
        ) {

            statement.generate();

        } catch (Exception e) {

            System.out.println(
                    "Statement Error: "
                            + e.getMessage()
            );
        }

        System.out.println(
                "\n===== APPLICATION END ====="
        );
    }
}