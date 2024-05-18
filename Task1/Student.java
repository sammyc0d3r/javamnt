package Task1;

public class Student extends Person {

    // Public constants representing student year levels
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    // Student year level (private for better encapsulation)
    private int status;

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name + " address: " + address + " phone: " + phone +
                " email: " + email + " status: " + status;
    }
}
