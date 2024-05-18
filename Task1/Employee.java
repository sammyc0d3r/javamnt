package Task1;

import java.text.DateFormat;  // Import for proper date formatting

public class Employee extends Person {

    // Employee's work location (private for better encapsulation)
     String office;

    // Employee's salary (private for better encapsulation)
     double salary;

    // Employee's hire date (private for better encapsulation)
     MyDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Getter methods for accessing information (optional)
    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;  // Consider returning a copy to avoid modification
    }

    @Override
    public String toString() {
        // Use DateFormat for cleaner date formatting
        DateFormat formatter = DateFormat.getDateInstance();
        return "Class: Employee, Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email +
                " Office: " + office + " Salary: " + salary + " Date Hired: " + dateHired;
    }
}
