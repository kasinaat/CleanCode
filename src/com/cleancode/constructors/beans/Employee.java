package com.cleancode.constructors.beans;
/*
* Java beans
*
* This method offers flexibility that the telescopic constructor doesn't offer.
* */
public class Employee {
    //Mandatory params
    private String name;
    private String email;
    private String role;

    //Optional Params
    private String address;
    private String mobileNumber;
    private String photo;

    public Employee(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
