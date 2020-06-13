package com.company;

import com.company.Database.DBConnection;
import com.company.Hotel.Order;
import com.company.Hotel.Worker;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();

        dbConnection.addWorker(new Worker(1,"David","Nilson",30,500,"administrator"));
        dbConnection.addWorker(new Worker(2,"Ivan","Milkovich",24,350,"cleaner"));
        dbConnection.addWorker(new Worker(3,"Anna","Karenina",27,550,"owner"));

        dbConnection.addOrder(new Order(1, new Date(120,5,25), new Date(120,6,15), 123, "+"));
        dbConnection.addOrder(new Order(2, new Date(120,5,14), new Date(120,6,25), 53, "+"));

//        System.out.println(dbConnection.getWorkersList());
//        System.out.println(dbConnection.getOrderList());
    }
}
