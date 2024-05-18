package Task1;

public class Person {

    // Personal information (private for better encapsulation)
     String name;
     String address;
     String phone;
     String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getter methods for accessing information (optional)
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email;
    }
}
