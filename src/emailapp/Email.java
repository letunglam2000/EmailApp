package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String company;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("""
                Enter the department
                1 for Sales
                2 for Development
                3 for Accounting
                0 for none""");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) { return "sales"; }
        else if (deptChoice == 2) { return "dev"; }
        else if (deptChoice == 3) { return "acct"; }
        else { return ""; }
    }

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the email

    @Override
    public String toString() {
        return firstName + "." + lastName + "@" + department + "." + company + ".com";
    }
}
