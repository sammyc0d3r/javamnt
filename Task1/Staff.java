package Task1;

public class Staff extends Employee {

    // Staff member's job title (private for better encapsulation)
    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name + " address: " + address + " phone: " + phone + " email: " + email +
                " office: " + office + " salary: " + salary + " title: " + title + " dateHired: " + dateHired;
    }
}
