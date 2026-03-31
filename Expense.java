class Expense {
    String title;
    double amount;
    String category;

    Expense(String title, double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    public String toString() {
        return title + "," + amount + "," + category;
    }
}