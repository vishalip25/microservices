package com.bookmanagement.lendingservice.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lend {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private Date lendDate;
    private int fees;
    public Lend(){
        
    }
    public Lend(int id, String firstName, String lastName, Date lendDate, int fees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lendDate = lendDate;
        this.fees = fees;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getLendDate() {
        return lendDate;
    }
    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    @Override
    public String toString() {
        return "Lend [fees=" + fees + ", firstName=" + firstName + ", id=" + id + ", lastName=" + lastName
                + ", lendDate=" + lendDate + "]";
    }
   
}
