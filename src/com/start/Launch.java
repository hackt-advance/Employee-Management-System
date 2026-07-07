package com.start;
import java.util.*;

import com.controller.MyController;
import com.dto.EmployeeDTO;
public class Launch {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome To Employee Management System");
   
    MyController  myController = new MyController();
    while(true){
        System.out.println("Press-1 for add Employee");
        System.out.println("Press-2 for Delete  Employee");
        System.out.println("Press-3 for update Employee");
        System.out.println("Press-4 for Read Employee");
        System.out.println("Press-5: for Read All Employee");
        System.out.println("Press-6: Exit\n");

        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();

        if(choice==6){
            System.out.println("Thankes For using this");
            break;
        }

        switch(choice){

            case 1:
                System.out.println("Add employee--");

                System.out.println("Age");
                int eage = sc.nextInt();
                
                sc.nextLine();
                System.out.println("Name");
                String ename = sc.nextLine();

                System.out.println("Id");
                int eid = sc.nextInt();

                System.out.println("Enter Epincode");
                int epincode = sc.nextInt();

                EmployeeDTO edto = new EmployeeDTO();
                edto.setEage(eage);
                edto.setEid(eid);
                edto.setEname(ename);
                edto.setEpincode(epincode);

                List result = myController.addEmployee(edto);
                System.out.println(result);

                break;

            case 2:
                //now we have to delety the employee
                System.out.println("--Deleting Employee--");

                
                System.out.println("Please Enter the Employee Id");
                int empId = sc.nextInt();
                System.out.println(myController.deleteSingleEmployee(empId));
                break;

           case 3:

               System.out.println("--Updating Employee--");
               System.out.println("please enter the employeeId");
               int id = sc.nextInt();
               System.out.println("enter the employee Name");
               sc.nextLine();
               String name = sc.nextLine();
               System.out.println(myController.updateSingleEmployee(id,name));
               break;
               
           case 4:
              System.out.println("Read Employee--");
              System.out.println("please enter the employee id");
              int id1 = sc.nextInt();
              myController.readSingleEmployee(id1);
              break;
          
              case 6:
                System.out.println("Read All Employee--");
                myController.readAllEmployee();
                
          default:
             System.out.println("Thankes For using this");


           }
    }

    sc.close();
  
   }

   

}
