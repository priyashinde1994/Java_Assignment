package com.example.demo;

import java.util.Objects;

public class EmployeeEquals {int id;
   private String firstname;
   private String lastname;

    public EmployeeEquals(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEquals that = (EmployeeEquals) o;
        return id == that.id && firstname.equals(that.firstname) && lastname.equals(that.lastname);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
}

