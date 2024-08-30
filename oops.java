


class Vehicle
{
    void Vehicle1()
    {
       System.out.println("Welcome to Vehicle Management System\n");
}
    }
    
}
class Car extends Vehicle{
    void Car1(){

    System.out.println("We have cars available for rent\n");
    }
}
class Bike extends Vehicle{
    void Bike1(){
         System.out.println("We have bikes available for rent\n");
}
    }
  
    

class CustomerDetails
{
    private String name;
    private String vehicleRented;
    private int rent;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    } 
    public void setvehicleRented(String vehicleRented)
    {
        this.vehicleRented=vehicleRented;
    }
    public String getvehicleRented()
    {
        return vehicleRented;
    } 
    public void setRent(int rent)
    {
        this.rent=rent;
    }
    public String getRent()
    {
        return rent;
    } 
 }

 class RentDetails{

    public void show(int a){
        System.out.println("Are you sure you requested for "+ a +"seater vehicles");

    }
    public void show(int a , int b ){
        System.out.println("Are you sure you requested for "+ a +" and "+b+" seater vehicles");
        
    }
 }



 class Helloworld
 {
    public static void main(String[args])
    {
        
    }
 }