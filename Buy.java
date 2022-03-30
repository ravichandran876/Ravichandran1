package com.book;
import java.util.Scanner;
public class Buy {
    public void bu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Delivery details");
           System.out.println("Enter your Name:");
        String name = input.next();
        System.out.println("Enter your Phone Number:");
        long number = input.nextLong();
        System.out.println("Enter the Delivery Address:");
        String add = input.next();
        System.out.println("Customer name:" + name + ".\nPhone number:" + number + ".\nDelivery Address:" + add + ".");
        System.out.println("you Successfully order by book.\nDelivery on After 2 days.\n                 ***Thanking you have a good day***");
    }
    }
