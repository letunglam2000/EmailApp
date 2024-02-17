package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(8);
        System.out.println("\nYour password is: " + password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "."+ lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("""
                DEPARTMENT CODES
                1 for Sales
                2 for Development
                3 for Accounting
                0 for none""");

        System.out.print("Enter the department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) { return "sales"; }
        else if (deptChoice == 2) { return "dev"; }
        else if (deptChoice == 3) { return "acct"; }
        else { return ""; }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword (String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public void showInfo() {
        System.out.println(
                "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
    }
}
