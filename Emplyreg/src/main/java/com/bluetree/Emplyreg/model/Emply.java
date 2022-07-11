package com.bluetree.Emplyreg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Emply {
    @Id
    @GeneratedValue
    private int id;
    private String fname;
    private String lname;
    private String email;
    private Date dob;

    private float salary;

    private int mobile;

    private int age;

    public Emply() {
    }

    public Emply(int id, String fname, String lname, String email, Date dob, float salary, int mobile, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.salary = salary;
        this.mobile = mobile;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public Date getDob() {
        return dob;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emply{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", salary=" + salary +
                ", mobile=" + mobile +
                ", age=" + age +
                '}';
    }
}
