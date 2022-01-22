package com.cleancode.constructors.builderpattern;

public class ChennaiEmployee implements EmployeeBuilder{
    public Employee employee;

    public ChennaiEmployee() {
        this.employee = new Employee();
    }

    @Override
    public void setName(String name) {
        employee.setName(name);
    }

    @Override
    public void setEmail(String email) {
        employee.setEmail(email);
    }

    @Override
    public void setRole(String role) {
        employee.setRole(role);
    }

    @Override
    public void setLocation() {
        employee.setLocation("Chennai");
    }

    @Override
    public void setSeatingLocation() {
        emp
    }

    @Override
    public Employee getEmployee() {
        return null;
    }
}
