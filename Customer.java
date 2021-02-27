

public class Customer {
    // Attributes
    int id;
    String name;
    String accountId;

    // Empty Constructor
    Customer() {
    }

    // Arguments Constructor
    Customer(int id, String name, String accountId) {
        // ADD YOUR CODE HERE
        this.id = id;
        this.name = name;
        this.accountId = accountId;
    }

    // Getters methods
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public static void main(String args[]) {
        // Initialize customer1 object using argument constructor
        Customer customer1 = new Customer(96, "john", "XYAH");
        System.out.println("customer1 id: " + customer1.getId());
        System.out.println("customer1 name: " + customer1.getName());
        System.out.println("customer1 accountId: " + customer1.getAccountId());
        // Initialize customer2 object using argument constructor
        Customer customer2 = new Customer(32, "mary", "2122");
        System.out.println("customer2 id: " + customer2.getId());
        System.out.println("customer2 name: " + customer2.getName());
        System.out.println("customer2 accountId: " + customer2.getAccountId());
    }
}