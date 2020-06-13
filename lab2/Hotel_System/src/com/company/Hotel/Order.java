package com.company.Hotel;

import java.sql.Date;

public class Order {
    private Date dateFrom,dateTo;
    private int room,id;
    private String firstName,lastName,status;

    public Order(){
        id = 0;
        status = "+";
    }

    public Order(int id, Date dateFrom, Date dateTo, int room, String status){
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.room = room;
        this.status = status;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
