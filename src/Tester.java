public class Tester {
    public static void main(String[] args) {
        // Creazione di due oggetti Employee
        Employee employee1 = new Employee("Mario", "Rossi", "Via Roma 1");
        Employee employee2 = new Employee("Luca", "Bianchi", "Via Milano 10");

        // Creazione dei relativi badge
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        // Mostra i dati dei tesserini dei due dipendenti
        System.out.println("Badge 1 details:");
        badge1.showBadgeDetails();

        System.out.println("\nBadge 2 details:");
        badge2.showBadgeDetails();
    }
}
