 package com.book;
import java.util.Random;
import java.util.Scanner;
public class login {
    public static void main(String args[]) {
        String user_choice;
        Scanner input = new Scanner(System.in);
        String Email, pass;
        System.out.println("                   ***WELCOME***");
        System.out.println("          Registration\n");
        System.out.println("Enter the Email Address:");
        Email = input.next();
        System.out.println("Password:");
        pass = input.next();
        System.out.println("Registered now given yes:");
        String ye = input.next();

        if (ye.equals("yes")) {
            Random rand = new Random();
            int maxNumber = 100;
            int randomNumber = rand.nextInt(maxNumber) + 5639123;
            System.out.println("User Mali id:" + Email + "\npassword:" + pass + "\nUser ID:" + randomNumber);
            System.out.println("          Successfully create your ID...\n");
do {
    System.out.println("Select the your choice.\n\t\t 1.Tamil Books.\n\t\t 2.English Books\n\t\t 3.Buy the Books");
    System.out.println("Enter the select title name:");

    user_choice = input.next();

    switch (user_choice) {

        case "Tamil":
            Tamilbooks tami = new Tamilbooks();
            tami.tmail();
            break;
        case "English":
            Englishbook eng = new Englishbook();
            eng.eng();
            break;
    }

}    while (true) ;

        }
        else {
            System.out.println("tri again");
        }
    }
        }



