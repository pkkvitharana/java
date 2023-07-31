

package com.mycompany.p3q1;


public class P3Q1 {
    private int age;
    private int salary;
    private String employee;
    public static void main(String[] args) {
        Test sc=new Test();
        sc.display();
    }
    public void setage(int age){
        this.age=age;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public void setemployee(String employee){
        this.employee=employee;
        
    }
    
    public int getage(){
        return age;
    }    
    public int getsalary(String employee){
        return salary;
    }   
    public String getemployee(){
        return employee;
        
    }
    
}

