package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        /*
        UC1
        check employee present or absent
         */
        int isPresent = (int) Math.floor(Math.random()*10)%2;
        if(isPresent == 1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }

    }
}
