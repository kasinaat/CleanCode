package com.cleancode.constructors.telescopic;
//Telescopic Constructor pattern - Doesn't scale well
public class Employee {
    //Mandatory params
    private final String name;
    private final String email;
    private final String role;

    //Optional Params
    private final String address;
    private final String mobileNumber;
    private final String photo;

    public Employee(String name, String email, String role) {
        this(name, email, role, "");
    }

    public Employee(String name, String email, String role, String address) {
        this(name, email, role, address, null);
    }

    public Employee(String name, String email, String role, String address, String mobileNumber) {
        this(name, email, role, address, mobileNumber, null);
    }

    public Employee(String name, String email, String role, String address, String mobileNumber, String photo) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.photo = photo;
    }

    /*
    * This telescopic constructors can be overcome by using java beans, but it comes with its own shortcomings. By Java beans I mean the using of getter/setters.
    * So the above class can be modified to only have one default constructor and setters for all other optional parameters. While this method may offer flexibility and
    * mutability, it may lead to inconsistency of the underlying data. See com.cleancode.constructors.beans.Employee
    * */
}
