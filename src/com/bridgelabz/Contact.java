package com.bridgelabz;

import java.util.Scanner;

public class Contact {
    Scanner sc = new Scanner(System.in);
    String firstName;
    String lastName;
    String email;
    String address;
    String city;
    String state;
    int zip;
    int phNo;

    public Contact(String firstName, String lastName, String email, String address, String city, String state, int zip, int phNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phNo = phNo;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }



    @Override
    public String toString() {
        return "Contact " +
                "firstName= " + firstName +
                ", lastName= " + lastName +
                ", email= " + email +
                ", address= " + address +
                ", city= " + city +
                ", state= " + state +
                ", zip=" + zip +
                ", phNo=" + phNo ;
    }

    public void editExisting() {

        System.out.print("Enter first name: ");
        String firstName = sc.next();
        System.out.print("Enter last name: ");
        String lastname = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.print("Enter address: ");
        String address = sc.next();
        System.out.print("Enter city: ");
        String city = sc.next();
        System.out.print("Enter state: ");
        String state = sc.next();
        System.out.print("Enter zip: ");
        int zip = sc.nextInt();
        System.out.print("Enter phone number: ");
        int phNo = sc.nextInt();
    }
}
