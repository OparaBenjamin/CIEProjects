package com.company;

public class Ex3_13 {
private String firstName;
private String lastName;
private double monthlySalary;

    public Ex3_13(String firstName, String lastName, double monthlySalary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
