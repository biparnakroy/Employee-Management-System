package com.biparnakroy.ems.mapper;

import com.biparnakroy.ems.entity.Employee;
import com.biparnakroy.ems.models.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public Employee mapToEmployee(EmployeeDto employeeDto){
        return  new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
