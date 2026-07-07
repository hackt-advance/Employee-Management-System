package com.dao;

import com.dto.EmployeeDTO;
import java.util.*;

public class EmployeeDAO {
      
    private static List list;

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
            System.out.println("Exception occured"+e);
            return "";
        }
    }

    public void readSingleEmployee(int id1){
        try{
        boolean isFound = false;
        for(int i=0;i<list.size();i++){
            EmployeeDTO edto = (EmployeeDTO)list.get(i);
            if(edto.getEid()==id1){
                System.out.println(edto.getEage()+" "+edto.getEid()+" "+edto.getEname()+" "+edto.getEpincode());
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("employee id is invalid");
        }

       }catch(Exception e){
          System.out.println("Exception occured"+e);
       }
    }

    public void readAllEmployee(){
           
           System.out.println(list);
    }

}
