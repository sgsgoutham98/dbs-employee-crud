package com.dbs.emp_mgmt.dao;

import com.dbs.emp_mgmt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("h2Dao")
public class H2EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public H2EmployeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee save(Employee employee) {
        this.jdbcTemplate.execute("insert into employee (id) values ("+employee.getId()+" )");
        return employee;
    }

    @Override
    public Employee update(long empId, Employee employee) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = this.jdbcTemplate.query("select * from employee", (resultSet, i) -> new Employee(resultSet.getInt(1), null , null));
        return employees;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public void deleteEmployee(long id) {

    }
}