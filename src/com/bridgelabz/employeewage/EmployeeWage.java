package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int wagePerHr = 20;
    static int fullTimeHrs = 8;
    static int partTimeHrs = 4;
    static int totalWorkingDays = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        /*
        * UC5
        * Calculate wages for month
        * */

        int totalHrs = 0;
        for(int i=0;i<totalWorkingDays;i++){
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
}
