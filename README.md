# Development of a Java Application for Accounting File Processing

## Objective
The objective of this assignment is to develop a Java application that processes accounting data stored in a text file. The application will read transaction records from a file named "accounting.dat" and perform various operations to demonstrate file handling and exception management in Java.

## Assignment Description
You are tasked with creating a Java application that will serve as the foundation for an accounting data processing system. The application will read a file containing transaction records, where each record represents an accounting entry with details such as date, description, and amount.

The application will consist of two main components:

1. **`Transaction` class**: This class will represent an individual accounting transaction. It should include fields for the transaction date, description, and amount, as well as appropriate constructors, getters, and setters.

2. **`AccountingFileProcessor` class**: This class will handle the reading of the "accounting.dat" file and the creation of `Transaction` objects. It will use a `Scanner` to read the file line by line and parse each line into a `Transaction` object.

## Requirements

1. Create a `Transaction` class with the following fields:
   - `String date`
   - `String description`
   - `double amount`

2. Create an `AccountingFileProcessor` class with a constructor that takes a file name as a parameter and initializes a `Scanner` to read the file. The constructor should throw a `FileNotFoundException` if the file does not exist.

3. Implement a method in the `AccountingFileProcessor` class called `processTransactions` that reads each line from the file, creates a `Transaction` object from the line, and stores it in a collection. Handle any potential exceptions that may occur during file reading.

4. Write a `main` method that demonstrates the use of the `AccountingFileProcessor` class. It should create an instance of the class with the "accounting.dat" file, call the `processTransactions` method, and print out the transaction details.

5. Ensure that your application handles exceptions gracefully, providing informative messages to the user if an error occurs (e.g., file not found, format errors in the file).

## Example Content of "accounting.dat"
```
2023-03-01,Office Supplies,150.00
2023-03-02,Client Lunch,45.75
2023-03-03,Internet Bill,60.00
2023-03-04,Travel Expense,300.00
```

## Deliverables
- `Transaction.java`: The Java class file for the `Transaction` class.
- `AccountingFileProcessor.java`: The Java class file for the `AccountingFileProcessor` class.
- `accounting.dat`: A sample text file containing transaction records.
- A report documenting your application's design, the approach taken to handle exceptions, and any assumptions made during development.

## Evaluation Criteria
- Correct implementation of the `Transaction` and `AccountingFileProcessor` classes.
- Proper handling of file reading and exceptions.
- Code readability and documentation.
- Successful demonstration of the application with the provided "accounting.dat" file.

## Submission Instructions
Submit all the deliverables by pushing it to your classroom GitHub repository. Ensure that your code is well-commented / documented and follows Java coding conventions. Include a README file with instructions on how to compile and run your application.
