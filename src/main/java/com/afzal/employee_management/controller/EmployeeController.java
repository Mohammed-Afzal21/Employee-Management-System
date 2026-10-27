package com.afzal.employee_management.controller;


import com.afzal.employee_management.entity.Employee;
import com.afzal.employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    //Constructor
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/api/employees")
    //Creating the list of the Employees
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/api/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    // Adding the employee
    @PostMapping("/api/employees")
    public Employee addEmployee(@Valid @RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    //Update the Details
    @PutMapping("/api/employees/{id}")
    public Employee updateEmployee(@Valid @PathVariable Long id,
                                   @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    //Delete the Employee
    @DeleteMapping("/api/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
