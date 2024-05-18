package Task1;

public class TestMain {

    public static void main(String[] args) {
        // Use descriptive names for people
        Person johnDoe = new Person("John Doe", "123 Main St", "555-123-4567", "john.doe@example.com");
        Student janeSmith = new Student("Jane Smith", "456 Elm St", "555-789-0123", "jane.smith@school.edu", Student.SOPHOMORE);

        // Use LocalDate for simpler date handling (assuming MyDate is similar)
        MyDate hireDate = new MyDate("2023-04-14");  // Update with a recent date

        Employee michaelLee = new Employee("Michael Lee", "789 Oak Ave", "555-456-7890", "michael.lee@company.com", "Marketing", 85000.00, hireDate);
        Faculty professorJones = new Faculty("Professor Jones", "1011 University Dr", "555-012-3456", "professor.jones@university.edu", "Science Building 203", 102000.00, hireDate, "MWF 10:00-11:00", "Full Professor");
        Staff maryWilliams = new Staff("Mary Williams", "234 Pine Blvd", "555-987-6543", "mary.williams@hospital.org", "Reception", 45000.00, hireDate, "Lead Receptionist");

        System.out.println(johnDoe);
        System.out.println(janeSmith);
        System.out.println(michaelLee);
        System.out.println(professorJones);
        System.out.println(maryWilliams);
    }
}
