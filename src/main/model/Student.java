package main.model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by iliesalinadenisa on 13/03/2017.
 */
public class Student {
   private int id;
   private String name;
   private java.sql.Date birthdate;
   private String address;

    public Student(int i, String alina, Date date, String das) {
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.sql.Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(java.sql.Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name
                 + ", birthdate=" + birthdate + ", address="
                + address + "]";
    }
}
