import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            // Create an instance of AccountingFileProcessor with the "accounting.dat" file
            AccountingFileProcessor fileProcessor = new AccountingFileProcessor("java/src/accounting.dat");

            // Print out the transaction details
            List<Transaction> transactions = fileProcessor.getTransactions();
            for (Transaction transaction : transactions) {
                System.out.println("Date: " + transaction.getDate() +
                        ", Description: " + transaction.getDescription() +
                        ", Amount: " + transaction.getAmount());
            }
        } catch (FileNotFoundException e) {
            // Gracefully handle file not found exception
            System.err.println("Exiting application due to missing file.");
        }
    }

}
