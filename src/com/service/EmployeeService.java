package com.service;
import java.util.ArrayList;
import java.util.List;
import com.dto.EmployeeDTO;
import com.dao.EmployeeDAO;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService(){
        employeeDAO = new EmployeeDAO();
    }
    
    public List addEmployee(EmployeeDTO edto){
        //first do the validation
        List listafterValidation = validEmployee(edto);

        if(listafterValidation.isEmpty()){
            List listAfterDAO = employeeDAO.insert(edto);
            return listAfterDAO;
        }else{
            return listafterValidation;
        }
    }

    public List validEmployee(EmployeeDTO edto){

        List list = new ArrayList<>();
        if(edto.getEage()<18||edto.getEage()>100){
            list.add("Invalid Age");
        }

        if(edto.getEid()<0){
            list.add("Invalid Id");
        }

        if(edto.getEpincode()<0||edto.getEpincode()>999999){
            list.add("Invalid Pincode");
        }

        return list;

    }

    public String deleteSingleEmployee(int empId){
          return employeeDAO.deleteSingleEmployee(empId);
    }

    public String updateSingleEmployee(int id,String name){
          if(id<0){
             return "you have entered invalid id";
          }
           return employeeDAO.updateSingleEmployee(id,name);
    }

    public void readSingleEmployee(int id1){
         employeeDAO.readSingleEmployee(id1);
    }

    public void readAllEmployee(){
         System.out.println("reading in service");
         employeeDAO.readAllEmployee();
    }
}
