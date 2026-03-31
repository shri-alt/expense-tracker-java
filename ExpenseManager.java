import java.io.*;
import java.util.*;

class ExpenseManager {

    static final String FILE_NAME = "expenses.txt";

    // Add Expense
    public void addExpense(Expense e) {
        // your code
    }

    // View Expenses
    public void viewExpenses() {
        // your code
    }

    // ✅ Total Expense (INSIDE class)
    public void totalExpense() {
        double total = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                total += Double.parseDouble(data[1]);
            }

            br.close();
            System.out.println("Total Expense: ₹" + total);
        } catch (IOException e) {
            System.out.println("Error calculating total.");
        }
    }

    // ✅ Search by Category (INSIDE class)
    public void searchByCategory(String category) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            System.out.println("\n--- Expenses in " + category + " ---");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase(category)) {
                    System.out.println("Title: " + data[0] +
                                       " | Amount: ₹" + data[1]);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error searching.");
        }
    }
}