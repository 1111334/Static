import java.util.Random;

class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private static String generateBadgeIdCode(Employee employee) {
        Random random = new Random();
        String randomCode1 = getRandomString(3);
        String randomCode2 = getRandomString(3);
        String nameSurname = employee.name + employee.surname;
        return randomCode1 + nameSurname + randomCode2;
    }

    private static String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            randomString.append(randomChar);
        }
        return randomString.toString();
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode(employee);
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees monitored by badges: " + totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }
}
