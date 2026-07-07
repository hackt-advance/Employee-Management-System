package com.dto;
public class EmployeeDTO {
    private int eage;
    private String ename;
    private int eid;
    private int epincode;
    public int getEage() {
        return eage;
    }
    public void setEage(int eage) {
        this.eage = eage;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public int getEpincode() {
        return epincode;
    }
    public void setEpincode(int epincode) {
        this.epincode = epincode;
    }

    public EmployeeDTO(){};

    public EmployeeDTO(int eage,String ename,int eid,int epincode){
        this.eage = eage;
        this.ename = ename;
        this.eid = eid;
        this.epincode = epincode;
    }


}
