package com.afzal.employee_management.service;


import com.afzal.employee_management.entity.Employee;
import com.afzal.employee_management.exception.EmployeeNotFoundException;
import com.afzal.employee_management.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Adding the Service
    public Employee addEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }



    //Update the Details
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
        existingEmployee.setFirstName(updatedEmployee.getFirstName());
        existingEmployee.setLastName(updatedEmployee.getLastName());
        existingEmployee.setEmail(updatedEmployee.getEmail());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());
        existingEmployee.setSalary(updatedEmployee.getSalary());
        return employeeRepository.save(existingEmployee);
    }

    //Delete The details
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    //Finding Employee By Their id
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }
}
