package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


//-----------------3. Junit tests for hashcode and equals----------------
@SpringBootTest
public class HashEqualTest {

    @Test
    void WithOutHashEqual() {
        Set<EmployeeNotHashEquals> set = new HashSet<>();

        set.add(new EmployeeNotHashEquals(1, "Gita", "pandey"));
        set.add(new EmployeeNotHashEquals(1, "Gita", "pandey"));
        EmpHashEqualPojo est = new EmpHashEqualPojo();
        System.out.println("size of set ---------" + est.getSizeEmpNotHashEquals(set));
        assertEquals(est.getSizeEmpNotHashEquals(set), set.size());


    }

    @Test
    void WithHashEqual() {
        Set<Employee> set = new HashSet<>();

        set.add(new Employee(1, "Gita", "pandey"));
        set.add(new Employee(1, "Gita", "pandey"));
        EmpHashEqualPojo est = new EmpHashEqualPojo();
        System.out.println("size of set ---------" + est.getSizeEmpSet(set));
        assertEquals(est.getSizeEmpSet(set), set.size());


    }

    @Test
    void WithEqual() {

        Set<EmployeeEquals> set = new HashSet<>();

        set.add(new EmployeeEquals(1, "Gita", "pandey"));
        set.add(new EmployeeEquals(1, "Gita", "pandey"));
        EmpHashEqualPojo est = new EmpHashEqualPojo();
//        System.out.println("size of set ---------" + est.getSizeEmpEquals(set));
        assertEquals(est.getSizeEmpEquals(set), set.size());

    }

    @Test
    void WithHash() {
        Set<EmployeeHash> set = new HashSet<>();

        set.add(new EmployeeHash(1, "Gita", "pandey"));
        set.add(new EmployeeHash(1, "Gita", "pandey"));
        EmpHashEqualPojo est = new EmpHashEqualPojo();
//        System.out.println("size of set ---------" + est.getSizeEmpHash(set));
        assertEquals(est.getSizeEmpHash(set), set.size());


    }


}
