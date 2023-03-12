package com.Assignment2.Staff;

import java.util.ArrayList;
import java.util.Scanner;

// Group Members
// David Samuels - 2101012913
// Althea Johnson Roach - 2101012491
// Kemoy Gallimore - 2017002408
// Glen Brown - 2101012479
// Darwin Dallas - 2101011317
public class Payroll
{

    public static void main(String[] args)
    {
        ArrayList<SalesRep> repList;//declares array
        repList = new ArrayList<SalesRep>();//initialize array to 5

        Scanner scan = new Scanner(System.in);//initialized scanner object for user input for firstname


        String name;
        double num2;


        Manager manager1 = new Manager();//initialize object for Manager class
        System.out.println("\nPlease Enter Manager Information");
        System.out.println("First Name: ");
        name = scan.nextLine();
        manager1.setFirstname(name);

        System.out.println("Last Name: ");
        name = scan.nextLine();
        manager1.setLastname(name);

        System.out.println("Department Number: ");
        name = scan.nextLine();
        manager1.setDeptNumber(name);

        System.out.println("Hours Worked: ");
        num2 = scan.nextDouble();
        manager1.setHoursWorked(num2);
        scan.nextLine();


        System.out.println("\nPlease Enter SaleRep Information");
         for(int i=0; i<2; i++)// for loop to get information form user
        {
            SalesRep salesRep = new SalesRep();//initialize object for Sales Rep class
            System.out.println("First Name: ");
            name = scan.nextLine();
            salesRep.setFirstname(name);

            System.out.println("Last Name: ");
            name = scan.nextLine();
            salesRep.setLastname(name);

            System.out.println("Department Number: ");
            name = scan.nextLine();
           salesRep.setDeptNumber(name);

            System.out.println("Hours Worked: ");
            num2 = scan.nextDouble();
            salesRep.setHoursWorked(num2);
            scan.nextLine();

            repList.add(salesRep);// user input goes to array
        }

        System.out.println("\nSaleRep Information");
        for(int i=0; i< repList.size(); i++)
        {
            SalesRep printList = repList.get(i); //printList object will store member/record in the array
            System.out.println("Rep Number: "+(i+1));//printing out details from array
            printList.display();// the printList object will now use the display method to show one record at a time from the array
        }

        System.out.println("\nManager Information");
        manager1.display();

    }


}
