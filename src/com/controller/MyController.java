package com.controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import java.util.*;
public class MyController {
     private EmployeeService employeeService;

     public MyController(){
         employeeService = new EmployeeService();
     }

     public List addEmployee(EmployeeDTO edto){
        return employeeService.addEmployee(edto);
     }

     public String deleteSingleEmployee(int empId){
        return employeeService.deleteSingleEmployee(empId);
  }

  public String updateSingleEmployee(int id,String name){
     return employeeService.updateSingleEmployee(id,name);
  }

  public void readSingleEmployee(int id1){
       employeeService.readSingleEmployee(id1);
  }

  public void readAllEmployee(){
       System.out.println("reading in service");
       employeeService.readAllEmployee();
  }

}
