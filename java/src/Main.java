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

/*~~~~~~~~~~~~~~~~~~~~~~~~~~REPORT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*
Design:

The Transaction class represents an individual accounting transaction with fields for date, description, and amount.
The AccountingFileProcessor class is responsible for reading a file containing transaction records,
creating Transaction objects, and handling exceptions during the process.

Exception Handling:

The AccountingFileProcessor constructor throws a FileNotFoundException if the specified file is not found.
The processTransactions method handles format errors in the file, and informative error messages are printed.
The main method demonstrates the usage of the classes, gracefully handling the file not found exception.
*
Assumptions:

The format of each line in the "accounting.dat" file is assumed to be valid (i.e., date, description, amount).
Amounts in the file are assumed to be in a valid numeric format.

* */
