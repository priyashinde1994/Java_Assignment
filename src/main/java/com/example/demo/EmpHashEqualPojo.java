package com.example.demo;

import java.util.Set;
import java.util.stream.Collectors;

public class EmpHashEqualPojo {


    public Integer getSizeEmpSet(Set<Employee> empset) {
        return
                empset
                        .stream().map(employee -> employee.getId() + employee.getFirstname() + employee.getLastname())
                        .collect(Collectors.toSet())
                        .size();

    }

    public Integer getSizeEmpNotHashEquals(Set<EmployeeNotHashEquals> empset) {

        return empset
                .stream().map(employee -> employee.getId() + employee.getfirstname() + employee.getlastname())
                .collect(Collectors.toSet())
                .size();

    }


    public Integer getSizeEmpEquals(Set<EmployeeEquals> empset) {
        return empset
                .stream().map(employee -> employee.getId() + employee.getfirstname() + employee.getlastname())
                .collect(Collectors.toSet())
                .size();

    }


    public Integer getSizeEmpHash(Set<EmployeeHash> empset) {
        return empset
                .stream().map(employee -> employee.getId() + employee.getfirstname() + employee.getlastname())
                .collect(Collectors.toSet())
                .size();

    }
}
