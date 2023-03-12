package com.Assignment2.Staff;

// Group Members
// David Samuels - 2101012913
// Althea Johnson Roach - 2101012491
// Kemoy Gallimore - 2017002408
// Glen Brown - 2101012479
// Darwin Dallas - 2101011317
public class SalesRep extends StaffMember {
    private double allowance;

    public SalesRep()
    {

    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double Salary() {

        return ((getHoursWorked() * 1500) + allowance);
    }

    public void display()
    {
        System.out.println("First Name: " + this.firstname);
        System.out.println("Last Name: "+ this.lastname);
        System.out.println("Dept. Number: "+ getDeptNumber());
        System.out.println("Allowance :"+ Salary());
    }
}
