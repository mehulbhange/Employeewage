package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int wagePerHr = 20;
    static int fullTimeHrs = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        /*
        UC1
        check employee present or absent
         */
        int isPresent = (int) Math.floor(Math.random()*10)%2;

        /*
        * UC2
        * Calculate daily wage
        * */
        if(isPresent == 1){
            System.out.println("Daily wage : "+ wagePerHr * fullTimeHrs);
        }else{
            System.out.println("Daily wage : " + 0 );
        }

    }
}
