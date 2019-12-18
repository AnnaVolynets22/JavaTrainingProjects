package emailapp;

import java.util.Scanner;

public class Email {
    //enum Department {SALES, DEPARTMENT, ACCOUNTING}
    private String firstName;
    private String lastName;
    private String department;
    //String company;
    private int defaultPasswordLength;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        department = setDepartment();
        System.out.println("Department is " + department);
        password = generateRandomPassword();

    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("DEPERTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice){
            case 1:
                return "sales";
                break;
            case 2:
                return "development";
                break;
            case 3:
                return "accounting";
                break;
        }
        return "";
    }

    //Generate a random password
    private String generateRandomPassword(int length){

    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }



}
