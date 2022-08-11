package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {

        private String companyName;
        private int wagePerHr;
        private int totalWorkingDays;
        private int totalWorkingHrs;

        public EmployeeWage(String companyName,int wagePerHr, int totalWorkingDays, int totalWorkingHrs){
            this.companyName = companyName;
            this.wagePerHr = wagePerHr;
            this.totalWorkingDays = totalWorkingDays;
            this.totalWorkingHrs = totalWorkingHrs;
        }

        public int computeEmployeeWage(){
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
        return totalHrs*wagePerHr;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage c1 = new EmployeeWage("TCS",25, 20, 100);
        System.out.println(c1.companyName+" : "+c1.computeEmployeeWage());
        EmployeeWage c2 = new EmployeeWage("Infosys",20, 25, 100);
        System.out.println(c2.companyName+" : "+c2.computeEmployeeWage());

    }
}
