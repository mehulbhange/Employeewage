package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int wagePerHr = 20;
    static int fullTimeHrs = 8;
    static int partTimeHrs = 4;
    static int totalWorkingDays = 20;
    static int totalWorkingHrs = 100;

    public void computeEmployeeWage(){
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

        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.computeEmployeeWage();

    }
}
