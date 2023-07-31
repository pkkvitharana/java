
package com.mycompany.p3q1i;


public class P3Q1i {
     private int age;
    private int salary;
    private String employee;
    
    

    public static void main(String[] args) {
       test sc=new test();
        sc.display(); 
        
    }
    P3Q1i(int age,int salary, String employee){
        this.age=age;
        this.salary=salary;
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
