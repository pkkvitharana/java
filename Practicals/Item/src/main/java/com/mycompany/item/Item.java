

package com.mycompany.item;


public class Item {
    private int location;
    private String description;

    public Item(int location,String description){
        this.location=location;
        this.description=description;
    
}
    public void setlocation(int location){
        this.location= location;
    }
    public void setdescription(String description){
        this.description= description;
    }
       
    public int getlocation(){
       return location;
    }
    public String getdescription(){
        return description;
    }
   
   
            
    public static void main(String[] args) {
       Monster obj=new Monster(100,"ABCD");
       
    }
}
