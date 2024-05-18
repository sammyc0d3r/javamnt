### README for Java Assignment

#### Overview

This assignment is divided into two parts, each aimed at helping beginner Java students understand and implement basic concepts of object-oriented programming (OOP).

### Part 1: Banking System (Package Task2)

This part of the assignment involves creating a simple banking system with two types of accounts: `Account` and `SavingAccount`. 

#### Files:
1. `Account.java`
2. `SavingAccount.java`
3. `Main.java`

#### Description:

1. **Account.java**:
    - Contains a class `Account` with the following private fields: `accountNumber` and `balance`.
    - Methods include:
        - `deposit(double amount)`: Adds the specified amount to the account balance.
        - `withdraw(double amount)`: Withdraws the specified amount from the account balance if sufficient funds are available; otherwise, prints an insufficient funds message.
        - `checkBalance()`: Returns the current balance.

2. **SavingAccount.java**:
    - Extends the `Account` class.
    - Inherits all methods from `Account` and overrides the `withdraw` method.

3. **Main.java**:
    - Demonstrates the usage of `Account` and `SavingAccount` classes.
    - Creates instances of these classes, performs deposit and withdrawal operations, and prints the account balances.

### Part 2: Person and Employee System (Package Task1)

This part involves creating a system to manage different types of people and their attributes. The hierarchy includes `Person`, `Student`, `Employee`, `Faculty`, and `Staff`.

#### Files:
1. `Person.java`
2. `Student.java`
3. `Employee.java`
4. `Faculty.java`
5. `Staff.java`
6. `MyDate.java`
7. `TestMain.java`

#### Description:

1. **Person.java**:
    - Basic class to store common attributes such as name, address, phone number, and email.

2. **Student.java**:
    - Extends `Person`.
    - Adds a class level attribute to represent the student's academic year (e.g., Freshman, Sophomore).

3. **Employee.java**:
    - Extends `Person`.
    - Adds attributes such as office, salary, and hire date.

4. **Faculty.java**:
    - Extends `Employee`.
    - Adds attributes such as office hours and rank.

5. **Staff.java**:
    - Extends `Employee`.
    - Adds an attribute for the staff member's title.

6. **MyDate.java**:
    - A helper class for managing dates (e.g., hire date).

7. **TestMain.java**:
    - Demonstrates the usage of the above classes.
    - Creates instances of `Person`, `Student`, `Employee`, `Faculty`, and `Staff`.
    - Prints out the details of each instance.

### Instructions

1. **Banking System (Task2)**:
    - Open your Java IDE.
    - Create a new package named `Task2`.
    - Add the `Account.java`, `SavingAccount.java`, and `Main.java` files to the package.
    - Run `Main.java` to see the banking system in action.

2. **Person and Employee System (Task1)**:
    - Create another package named `Task1`.
    - Add the `Person.java`, `Student.java`, `Employee.java`, `Faculty.java`, `Staff.java`, `MyDate.java`, and `TestMain.java` files to the package.
    - Run `TestMain.java` to see the output of the various class instances.

### Summary

This assignment helps you understand the basics of class inheritance, method overriding, and object creation in Java. By completing both parts, you will gain practical experience in managing class hierarchies and implementing OOP principles.
