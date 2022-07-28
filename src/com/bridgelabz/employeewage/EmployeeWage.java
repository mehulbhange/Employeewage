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
        * UC4
        * Solving using switch case
        * */
        switch (isPresent){
            case 1:
                System.out.println("Employee wage : "+ wagePerHr*fullTimeHrs);
                break;
            case 2:
                System.out.println("Employee wage : "+ wagePerHr*partTimeHrs);
                break;
            default:
                System.out.println("Employee wage : "+ 0);
                
        }

    }
}
