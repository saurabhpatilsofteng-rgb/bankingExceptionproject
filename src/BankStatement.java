public class BankStatement implements AutoCloseable {

    public BankStatement() {

        System.out.println(
                "Bank statement resource opened"
        );
    }

    public void generate() {

        System.out.println(
                "Generating bank statement..."
        );

        System.out.println(
                "Statement generated successfully"
        );
    }

    @Override
    public void close() {

        System.out.println(
                "Bank statement resource closed automatically"
        );
    }
}