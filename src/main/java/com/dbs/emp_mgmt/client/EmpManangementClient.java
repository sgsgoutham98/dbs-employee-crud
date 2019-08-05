package com.dbs.emp_mgmt.client;

import com.dbs.emp_mgmt.controller.EmployeeController;
import com.dbs.emp_mgmt.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.time.LocalDate;

public class EmpManangementClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        Employee employee = new Employee(12,"Harish", LocalDate.of(1985,5, 25));

        employeeController.saveEmployee(employee);

    }
}