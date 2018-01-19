package com.example.fattah.firebaselogin;

/**
 * Created by Fattah on 6/12/2017.
 */

public class info {

    public String name;
    public String dateIn;
    public String late;
    public String address;
    public String dateOut;
    public String key;

    public info() {
    }

    public info(String name, String dateIn , String late , String address , String dateOut, String key) {
        this.name = name;
        this.dateIn = dateIn;
        this.late = late;
        this.address = address;
        this.dateOut = dateOut;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
