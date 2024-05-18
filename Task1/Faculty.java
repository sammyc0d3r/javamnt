package Task1;

public class Faculty extends Employee {

    // Faculty member's office hours and academic rank (private for encapsulation)
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Getter methods for accessing information (optional)
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email +
                " Office: " + office + " Salary: " + salary + " Date Hired: " + dateHired +
                " Office Hours: " + officeHours + " Rank: " + rank;
    }
}
