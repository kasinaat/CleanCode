package com.cleancode.constructors.staticfactorymethods;
/*
* @author - SSK
*
* */
public class Employee {
    private final String name;
    private final String email;
    private final EmployeeRole role;

    private Employee(String name, String email, EmployeeRole role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    /* This particular class doesn't convey the need for a static factory method
    But consider if an Employee needs to be created with default role/location.Rather than calling the constructors without
    knowing the arguments or creating a constructor with default arguments,it is better to have a static factory method as below */

    //Also see com.cleancode.constructor.Employee class class which shows Telescopic Constructor Pattern

    //Static factory Methods
    public static Employee createDeveloper(String name, String email){
        return new Employee(name, email, EmployeeRole.DEVELOPER);
    }
    public static Employee createQualityAnalyst(String name, String email) {
        return new Employee(name, email, EmployeeRole.QUALITY_ANALYST);
    }
    /*
    * But static factory methods aren't the only answer, if the object creation becomes complex with more arguments, then we should adopt Builder Design pattern
    * */
}
