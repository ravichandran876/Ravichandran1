package com.book;
import java.util.Scanner;
import java.util.LinkedList;

public class Englishbook {
    public void eng() {
        Scanner input = new Scanner(System.in);
        String Bookname, Authorname, yes;
        int cost, count,discount,dis,sum,co;
        System.out.println("you select the English language books");
        LinkedList<String> English = new LinkedList<>();
        English.add("Believe in Yourself");
        English.add("\nWings of fire Paperback");
        English.add("\nOne Day, Life Will Change");
        English.add("\nYou are the Best Wife");
        English.add("\nA Girl to Remember");
        System.out.println(English);
        System.out.println("This books available in the store.");
        System.out.println("See the book detail yes or no:");
        yes = input.next();
        if (yes.equals("yes")) {
            Bookname = "Believe in Yourself";
            Authorname = "Dr. Joseph Murphy ";
            cost = 129;
            count = 5;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity" + count + "\n\n");

            Bookname = "Wings of fire Paperback";
            Authorname = "A.P.J. Abdul Kalam";
            cost = 129;
            count = 4;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity" + count + "\n\n");


            Bookname = "One Day, Life Will Change";
            Authorname = "Saranya Umakanthan";
            cost = 139;
            count = 3;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

            Bookname = "You are the Best Wife";
            Authorname = "Ajay K Pandey";
            cost = 149;
            count = 2;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

            Bookname = "A Girl to Remember";
            Authorname = "Ajay K Pandey";
            cost = 145;
            count = 6;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

        } else {
            System.out.println("Sorry try again");
        }

        System.out.println("You con buy the book yes or no:");
        String y = input.next();
        if (y.equals("yes")) {
            System.out.println("Enter the book name:");
            Bookname = input.next();
            System.out.println("Enter the book quantity:");
            count = input.nextInt();

            if(Bookname.equals("Believe_in_Yourself")) {
                cost = 129;
                discount = 9;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");

            } else if (Bookname.equals("Wings_of_fire_Paperback")) {

                cost = 129;
                discount = 11;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount" + discount + "%");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");

            } else if (Bookname.equals("One_Day,_Life_Will_Change")) {
                cost = 139;
                discount = 11;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");

            } else if (Bookname.equals("You_are_the_Best_Wife")) {
                cost = 149;
                discount = 9;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;
                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");
            } else if (Bookname.equals("A_Girl_to_Remember")) {
                cost = 145;
                discount = 12;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;
                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");

            } else {
                System.out.println("sorry try Agan");

            }
            Buy b=new Buy();
            b.bu();
        }
    }
}
