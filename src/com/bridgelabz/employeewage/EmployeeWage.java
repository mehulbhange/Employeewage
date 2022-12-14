package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeWage implements IEmployeeWage {

    // Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;

    private ArrayList<CompanyEmpWage> companyEmpWageList;

    private CompanyEmpWage companyEmpWage;
    public EmployeeWage(){
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompany(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs){
        companyEmpWage = new CompanyEmpWage(companyName,wagePerHr,totalWorkingDays,totalWorkingHrs);
        companyEmpWage.setTotalEmpWage(computeEmployeeWage(wagePerHr,totalWorkingDays,totalWorkingHrs));
        companyEmpWageList.add(companyEmpWage);

    }


    public int computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs){
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
                    case IS_FULLTIME:
                        totalHrs += fullTimeHrs;
                        companyEmpWage.getDailyWages().add(fullTimeHrs);
                        break;
                    case IS_PARTTIME:
                        totalHrs += partTimeHrs;
                        companyEmpWage.getDailyWages().add(partTimeHrs);
                        break;
                    default:
                        companyEmpWage.getDailyWages().add(0);
                }

            }

        return totalHrs*wagePerHr;
    }

    public void getTotalWage(String companyName){
        for (CompanyEmpWage cmp : this.companyEmpWageList){
            if (cmp.getCompanyName() == companyName){
                System.out.println(cmp.getCompanyName() +" : "+ cmp.getTotalEmpWage());
                return;
            }
        }
        System.out.println(companyName + " not found!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompany("TCS",20,20,100);
        employeeWage.addCompany("Infosys", 25, 15, 80);
        employeeWage.addCompany("Accenture", 40, 25, 120);
        employeeWage.addCompany("Jio",50,20,100);

        employeeWage.getTotalWage("TCS");
        employeeWage.getTotalWage("Jio");
        employeeWage.getTotalWage("Amazon");


    }
}
