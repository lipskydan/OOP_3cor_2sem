package com.company.Hotel;

import java.io.Serializable;
import java.sql.Date;

public class OrderFeatures implements Serializable {

    int minPrice, maxPrice;
    String[] checkedCategories;
    int occupancy;
    Date dateFrom, dateTo;

    public OrderFeatures() {
        minPrice = maxPrice = occupancy = 1;
        checkedCategories = null;
        dateFrom = new Date(0);
        dateTo = new Date(0);
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String[] getCheckedCategories() {
        return checkedCategories;
    }

    public void setCheckedCategories(String[] checkedCategories) {
        this.checkedCategories = checkedCategories;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
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
}
