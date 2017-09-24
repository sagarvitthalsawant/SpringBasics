package com.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("employeeDAO")
public class EmploymentDAOImpl implements EmploymentDAO{
    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(1);
        e.setFirstName("Sagar");
        e.setLastName("Sawant");
        return e;
    }
}
