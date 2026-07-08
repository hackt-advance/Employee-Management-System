package com.dao;

import com.dto.EmployeeDTO;
import java.util.*;

public class EmployeeDAO {
      
    private static List<EmployeeDTO> list;

    static{
        list = new ArrayList<>();
    }

    public List insert(EmployeeDTO edto){
        List localList = new ArrayList<>();
        try{
          list.add(edto);

          localList.add("Successfully added");
         
        }catch(Exception e){
           e.printStackTrace();
           localList.add("Expection occured");
        }

        return localList;
    }

    public String deleteSingleEmployee(int empId){
        boolean isFound = false;
        for(int i=0;i<list.size();i++){
            EmployeeDTO edto = (EmployeeDTO)list.get(i);
            if(edto.getEid()==empId){
                list.remove(edto);
                isFound = true;
                break;
            }
        }

        if(isFound){
            return "Employee Deleted";
        }else{
            return "employee Not Found With that Id"; 
        }
    }

    public String updateSingleEmployee(int id,String name){
        try{
         boolean isFound = false;
         for(int i=0;i<list.size();i++){
            EmployeeDTO edto = (EmployeeDTO)list.get(i);
            if(edto.getEid()==id){
                edto.setEname(name);
                isFound = true;
                break;
            }
         }

         if(isFound){
            return "Successfully Updated";
         }else{
            return "id not found";
         }
        }catch(Exception e){
            System.out.println("exception occured"+e);
            return "";
        }
    }

    public EmployeeDTO readSingleEmployee(int id1){
        EmployeeDTO nedto = null;
        try{
        boolean isFound = false;
        for(int i=0;i<list.size();i++){
            EmployeeDTO edto = (EmployeeDTO)list.get(i);
            if(edto.getEid()==id1){
                nedto = edto;
                isFound = true;
                break;
            }
        }
       }catch(Exception e){
          System.out.println("Exception occured"+e);
       }

        return nedto;
    }

    public List<EmployeeDTO> readAllEmployee(){
           return EmployeeDAO.list;
    }

}
