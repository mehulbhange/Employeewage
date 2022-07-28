package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int wagePerHr = 20;
    static int fullTimeHrs = 8;
    static int partTimeHrs = 4;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        /*
        UC1
        check employee present or absent
         */
        int isPresent = (int) Math.floor(Math.random()*10)%3;

        /*
        * UC3
        * Calculate daily wage with part time
        * */
        if(isPresent == 1){
            System.out.println("Daily wage : "+ wagePerHr * fullTimeHrs);
        }else if(isPresent == 2){
            System.out.println("Daily wage : "+ wagePerHr * partTimeHrs);
        }else{
            System.out.println("Daily wage : " + 0 );
        }

    }
}
