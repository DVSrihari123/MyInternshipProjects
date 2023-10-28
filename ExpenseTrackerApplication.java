import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String description;
    double amount;
    String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public String toString() {
        return "Description: " + description + ", Amount: $" + amount + ", Category: " + category;
    }
}

class ExpenseTracker {
    ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount, String category) {
        expenses.add(new Expense(description, amount, category));
    }

    public void viewExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public double getTotalExpenseForCategory(String category) {
        double total = 0;
        for (Expense expense : expenses) {
            if (expense.category.equalsIgnoreCase(category)) {
                total += expense.amount;
            }
        }
        return total;
    }
    
    public void saveExpensesToFile() {        
    }

    public void loadExpensesFromFile() {
        
    }
}

public class ExpenseTrackerApplication {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense for Category");
            System.out.println("4. Save Expenses");
            System.out.println("5. Load Expenses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    tracker.addExpense(description, amount, category);
                    break;
                case 2:
                    tracker.viewExpenses();
                    break;
                case 3:
                    System.out.print("Enter category: ");
                    String categoryToSummarize = scanner.nextLine();
                    double totalForCategory = tracker.getTotalExpenseForCategory(categoryToSummarize);
                    System.out.println("Total expense for category " + categoryToSummarize + ": $" + totalForCategory);
                    break;
                case 4:
                    tracker.saveExpensesToFile();
                    break;
                case 5:
                    tracker.loadExpensesFromFile();
                    break;
                case 6:
                    tracker.saveExpensesToFile();
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
