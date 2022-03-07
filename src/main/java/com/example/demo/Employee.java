package com.example.demo;


import java.util.Objects;


public class Employee implements Comparable<Employee> {


    private String lastname;
   private int id;
    private String firstname;


    public Employee() {

    }

    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstname.equals(employee.firstname) && lastname.equals(employee.lastname);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }

    void display() {

        System.out.println("Emp Id:" + getId() + "  " + "Empfirstname:" + "  " + getFirstname() + "  " + "Emplastname:" + getLastname());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee emp) {
        if (this.id == emp.getId())
            return 0;
        else if (this.id > emp.getId())
            return 1;
        else return -1;
    }
}
