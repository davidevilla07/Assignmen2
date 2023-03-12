package com.Assignment2.Staff;

// Group Members
// David Samuels - 2101012913
// Althea Johnson Roach - 2101012491
// Kemoy Gallimore - 2017002408
// Glen Brown - 2101012479
// Darwin Dallas - 2101011317
public class StaffMember extends CalculateSalary{
    protected String firstname;
    protected String lastname;
    private String deptNumber;
    private double hoursWorked;
    private double allowance;
    private double bonus;


    public StaffMember()
    {

    }

    @Override
    public double Salary() {
        return 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double CalculateSalary()
    {

        return CalculateSalary();
    }
    public void display()
    {
    System.out.println("First Name: " + firstname);
    System.out.println("Last Name: "+ lastname);
    System.out.println("Dept. Number: "+ deptNumber);
    System.out.println("Hours worked: " + hoursWorked);
    }




}
