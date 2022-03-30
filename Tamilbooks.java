package com.book;
import java.util.LinkedList;
import java.util.Scanner;
public class Tamilbooks {
    public void tmail() {
        String Bookname, Authorname, yes;
        int cost, count, discount, dis, sum, co;
        Scanner input = new Scanner(System.in);
        System.out.println("you select the tamil language books");
        LinkedList<String> tamil = new LinkedList<>();
        tamil.add(" Thirukkural");
        tamil.add("\n mother_is_coming");
        tamil.add("\n KI,KU,KI,PI");
        tamil.add("\n coming_win");
        tamil.add("\n Rajaraja_Chozhan");
        System.out.println(tamil);
        System.out.println("This books available in the store.");
        System.out.println("See the book detail yes or no:");
        yes = input.next();
        if (yes.equals("yes")) {
            Bookname = "Thirukkural";
            Authorname = "Thiruvalluvar";
            cost = 129;
            count = 4;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

            Bookname = "mother_is_coming";
            Authorname = "Janakiraman";
            cost = 250;
            count = 3;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

            Bookname = "KI,KU,KI,PI";
            Authorname = "Madhan";
            count = 3;
            cost = 350;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");


            Bookname = "coming_win";
            Authorname = "madhan";
            count = 5;
            cost = 300;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n\n");

            Bookname = "Rajaraja_Chozhan";
            Authorname = "Sa.Na.Kannan";
            count = 5;
            cost = 400;
            System.out.println("Book Name:" + Bookname);
            System.out.println("Book Author Name:" + Authorname);
            System.out.println("Book price:" + cost);
            System.out.println("Book quantity:" + count + "\n");

        } else {
            System.out.println("This book Not available this book");

        }

        System.out.println("You con buy the book yes or no:");
        String y = input.next();
        if (y.equals("yes")) {
            System.out.println("Enter the book name:");
            Bookname = input.next();
            System.out.println("Enter the book quantity:");
            count = input.nextInt();
            if (Bookname.equals("Thirukkural")) {

                cost = 129;
                discount = 18;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");
            } else if (Bookname.equals("mother_is_coming")) {
                cost = 250;
                discount = 15;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * cost;
                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("total price:" + sum + ".");

            } else if (Bookname.equals("KI,KU,KI,PI")) {

                cost = 350;
                discount = 10;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%.");

                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");
            } else if (Bookname.equals("coming_win")) {
                cost = 300;
                discount = 15;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");
            } else if (Bookname.equals("Rajaraja_Chozhan")) {
                cost = 400;
                discount = 12;
                dis = 100 - discount;
                co = (dis * cost) / 100;
                sum = co * count;

                System.out.println("this book discount:" + discount + "%.");
                System.out.println("You order by:" + count + " book.");
                System.out.println("Book cost:" + cost + ".");
                System.out.println("Total price:" + sum + ".");
             }
              else {
                  System.out.println("sorry tri again");
            }
              Buy e=new Buy();
              e.bu();

        }
    }

}
