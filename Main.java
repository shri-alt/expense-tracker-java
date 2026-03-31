import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
           System.out.println("\n=== Expense Tracker ===");
           System.out.println("1. Add Expense");
           System.out.println("2. View Expenses");
           System.out.println("3. Total Expense");
           System.out.println("4. Search by Category");
           System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(choice)
            {
                 case 1:
                 System.out.print("Enter title: ");
                 String title = sc.nextLine();

                 System.out.print("Enter amount: ");
                 double amount = sc.nextDouble();
                 sc.nextLine();

                 System.out.print("Enter category: ");
                 String category = sc.nextLine();

                 Expense e = new Expense(title, amount, category);
                 manager.addExpense(e);
                 break;
                case 2:
                  manager.viewExpenses();
                 break;
                case 3:
                 manager.totalExpense();
                 break;

                case 4:
                 System.out.print("Enter category: ");
                 String cat = sc.nextLine();
                 manager.searchByCategory(cat);
                 break;

                case 5:
                 System.out.println("Exiting...");
                 return;

                default:
                 System.out.println("Invalid choice!");
            }

           
          
        }
    }
}