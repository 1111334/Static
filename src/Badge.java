class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode(String name, String surname) {
        String randomCode1 = "XYZ";
        String randomCode2 = "ZYX";
        return randomCode1 + name + surname + randomCode2;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
        System.out.println("Employee details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        employee = employeeThatNeedsBadge;
        keepTrackOfEmployeesNumber();
        badgeIdCode = generateBadgeIdCode(employee.name, employee.surname);
    }
}