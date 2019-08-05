package com.dbs.emp_mgmt.controller;

import com.dbs.emp_mgmt.model.Employee;
import com.dbs.emp_mgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    Employee saveEmployee(Employee employee){
        return this.employeeService.saveEmployee(employee);
    }

    List<Employee> listAll(){
        return this.employeeService.listAll();
    }

    Employee findById(long empId){
        return this.employeeService.findById(empId);
    }

    void deleteEmployee(long empId){
        this.employeeService.deleteEmployee(empId);
    }
}