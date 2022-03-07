package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DemoApplicationTests {

    BasicJUnitCalci c = new BasicJUnitCalci();

    @Test
    void contextLoads() {
    }
//-----------------1. basic unit test----------------

    @Test
    void sum() {

        int expResult = 10;
        int actualResult = c.add(5, 5);

        assertThat(actualResult).isEqualTo(expResult);

    }

    //-----------------4. Default and custom sorting ----------------
    @Test
    void employeeTreeSetDefaultSortingTest() {
        String expectedStringEmpList = "[Employee{id=1, firstname='Rajesh', lastname='Tandel'}, " +
                "Employee{id=2, firstname='Priyanka', lastname='Shinde'}, " +
                "Employee{id=3, firstname='Sumit', lastname='Paswan'}]";

        Set<Employee> empTSet = new TreeSet<>();

        empTSet.add(new Employee(3, "Sumit", "Paswan"));
        empTSet.add(new Employee(1, "Rajesh", "Tandel"));
        empTSet.add(new Employee(2, "Priyanka", "Shinde"));
        System.out.println(empTSet);
        assertEquals(expectedStringEmpList, empTSet.toString());
    }

    @Test
    void employeeTreeSetCustomSortingWithFirstNameTest() {
        String expectedStringEmpList = "[Employee{id=2, firstname='Ashu', lastname='Shinde'}, " +
                "Employee{id=1, firstname='Gargee', lastname='Mohite'}, " +
                "Employee{id=3, firstname='Linar', lastname='Mohite'}]";

//adding comparator for sorting on the basis of first name
        Set<Employee> empTSet =
                new TreeSet<Employee>(Comparator.comparing(Employee::getFirstname));
        empTSet.add(new Employee(1, "Gargee", "Mohite"));
        empTSet.add(new Employee(2, "Ashu", "Shinde"));
        empTSet.add(new Employee(3, "Linar", "Mohite"));


        System.out.println(empTSet);
        assertEquals(expectedStringEmpList, empTSet.toString());
    }


    //-----------------5. Square of each even no ----------------
    @Test
    void squareOfEachEven() {


        List<Integer> expected = Arrays.asList(4, 25, 9, 36, 9);

        SquareOfEachAndAllEven square = new SquareOfEachAndAllEven();

        List<Integer> actual = square.getSquare(Arrays.asList(2, 5, 3, 6, 3));
        System.out.println(square.getSquare(Arrays.asList(2, 5, 3, 6, 3)));
        assertEquals(expected, actual);
    }

    //-----------------6. Square of all even no ----------------
    @Test
    void squareOfAllEven() {


        List<Integer> expected = Arrays.asList(4, 16);

        SquareOfEachAndAllEven evenSquare = new SquareOfEachAndAllEven();
        List<Integer> actual =
                evenSquare.getEvenSquare(Arrays.asList(1, 2, 3, 4));
        System.out.println(actual);

        assertEquals(expected, actual);
    }


//-----------------7. Try with resource ----------------

    @Test
    void tryWithResourceCLosed() {

        Scanner temp;
        try (Scanner sc = new Scanner(System.in)) {
            temp = sc;
        }

        String expected = "Scanner closed";
        String actual = null;
        try {
            temp.nextLine();
        } catch (Exception e) {
            actual = e.getLocalizedMessage();
        }

        assertEquals(expected, actual);
    }


}