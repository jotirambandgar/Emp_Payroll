package com.bridgelabz;

public class EmployeeWageBuilder {

    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        final int WAGE_PER_HR = 20;
        int empHR =0 ;
        double empCheck = Math.floor((Math.random() * 10)) % 2;
        System.out.println(IS_PRESENT);
        if(empCheck == IS_PRESENT) {
            empHR = 8;
        }
        int empWage = WAGE_PER_HR * empHR;
        System.out.println("Employee wage: " + empWage);
    }
}
