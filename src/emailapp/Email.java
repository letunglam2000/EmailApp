package emailapp;

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
    }

    // Ask for the department

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the email

    @Override
    public String toString() {
        return firstName + "." + lastName + "@" + department + "." + company + ".com";
    }
}
