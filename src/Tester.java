public class Tester {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("Mike", "Doe", "123 Main St");
        Employee employee2 = new Employee("Jane", "Smith", "456 Oak Ave");

        // Create their respective badges
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        // Show badge details for both employees
        System.out.println("Employee 1 Badge Details:");
        badge1.showBadgeDetails();

        System.out.println("\nEmployee 2 Badge Details:");
        badge2.showBadgeDetails();
    }
}