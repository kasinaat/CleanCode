package com.cleancode.constructors.builderpattern;
//Here we define the steps to create an employee object with the required params and also have a method
//that returns the finished product which is the Employee Object.
//Scenario - Parameters of the Employees change based on their workLocation
public interface EmployeeBuilder {
    void setName(String name);
    void setEmail(String email);
    void setRole(String role);
    void setLocation();
    void setSeatingLocation();
    Employee getEmployee();
}
