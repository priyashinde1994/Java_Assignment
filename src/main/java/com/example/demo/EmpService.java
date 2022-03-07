package com.example.demo;

import java.util.HashSet;


public class EmpService  {

    static  void setData(){
        Employee e1 = new Employee(1,"Sita","deshmukh");
        Employee e2 = new Employee(1,"Sita","deshmukh");

        System.out.println("for testing git add and commit");
        HashSet<Employee> hs = new HashSet<Employee>();
        hs.add(e1);
        hs.add(e2);

        for (Employee emp: hs
             ) {
            System.out.println("id:"+"   "+emp.getId()+"   "+"firstname:"+" "+emp.getFirstname()+"   "+"lastname:"+" "+emp.getLastname());
        }

    }
    public static void main(String[] args) {

EmpService.setData();







    }
}
