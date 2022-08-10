package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {

        public void computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs){
        int fullTimeHrs = 8;
        int partTimeHrs = 4;
        int totalHrs = 0;
        int days = 0;

        while (totalHrs < totalWorkingHrs && days < totalWorkingDays){
            days++;
            int isPresent = (int) Math.floor(Math.random()*10)%3;
            switch (isPresent){
                case 1:
                    totalHrs += fullTimeHrs;
                    break;
                case 2:
                    totalHrs += partTimeHrs;
                    break;
                default:
                    totalHrs += 0;

            }
        }
        System.out.println("Monthly wage : "+ totalHrs*wagePerHr);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage c1 = new EmployeeWage();
        c1.computeEmployeeWage(25, 20, 100);
        EmployeeWage c2 = new EmployeeWage();
        c2.computeEmployeeWage(20, 25, 100);

    }
}
