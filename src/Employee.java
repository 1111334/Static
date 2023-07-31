//import java.util.Random;

class Employee {
    String name;
    String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
    }
}