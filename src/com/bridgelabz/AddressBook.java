package com.bridgelabz;

//Create an addressBook and multiple contacts inside that addressBook,
//        Follow Object and classes principles


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> list = new ArrayList<Contact>();
    static Scanner sc = new Scanner(System.in);

  void add(){
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
         Contact contact = new Contact(firstName, lastname, email, address, city, state, zip, phNo);
         list.add(contact);
        }
 void editContact(){
     System.out.println("Enter first name: ");
     String firstName = sc.next();
     System.out.println("Enter first name: ");
     String lastName = sc.next();
     for (Contact contact : list) {
         if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
             contact.editExisting();
         }
         else {
             System.out.println("Your name is not present in contact list");
         }

     }
 }


    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        while (true){
            System.out.println("1. Add new contact.\n2. Edit contact.");
            int check = sc.nextInt();
           if (check == 1){
               addressBook.add();
           } else if (check == 2) {
               addressBook.editContact();
           }
            System.out.println(addressBook.list);

        }

  }

}
