import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountingFileProcessor {
    private String fileName;
    private List<Transaction> transactions;

    public AccountingFileProcessor(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.transactions = new ArrayList<>();
        // Initialize Scanner to read the file
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            processTransactions(fileScanner);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("Error: File not found - " + fileName);
            throw e;
        }
    }

    public void processTransactions(Scanner fileScanner) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            try {
                // Parse each line into a Transaction object
                Transaction transaction = parseTransaction(line);
                transactions.add(transaction);
            } catch (IllegalArgumentException e) {
                // Handle format errors in the file
                System.err.println("Error parsing line: " + line + " - " + e.getMessage());
            }
        }
    }

    private Transaction parseTransaction(String line) {
        String[] parts = line.split(",");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid format");
        }

        String date = parts[0];
        String description = parts[1];
        double amount;

        try {
            amount = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid amount format");
        }

        return new Transaction(date, description, amount);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

}

