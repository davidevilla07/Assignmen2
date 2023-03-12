package com.Assignment2.Staff;
// Group Members
// David Samuels - 2101012913
// Althea Johnson Roach - 2101012491
// Kemoy Gallimore - 2017002408
// Glen Brown - 2101012479
// Darwin Dallas - 2101011317
public class Manager extends StaffMember {

    private double bonus;

    public Manager()
    {

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double Salary() {

        return ((getHoursWorked() * 2500) + bonus);
    }
    public void display()
    {
        System.out.println("First Name: " + getFirstname());
        System.out.println("Last Name: "+ getLastname());
        System.out.println("Dept. Number: "+ getDeptNumber());
        System.out.println("Hours worked: " + getHoursWorked());
        System.out.println("Bonus: " + Salary());
    }
}
