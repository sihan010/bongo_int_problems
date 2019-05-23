public class Abstraction_Proposed
{
  public static void main(String[] args)
  {
   	car c = new car();
    c.set_num_of_wheels(4);
    c.set_num_of_passengers(5);
    c.set_gas(true);
    System.out.println(c.result_string());
    
    plane p = new plane();
    p.set_num_of_wheels(16);
    p.set_num_of_passengers(250);
    p.set_gas(true);
    System.out.println(p.result_string());
  }
}

abstract class Vehicle{
    public int num_of_wheels;
  	public int num_of_passengers;
  	public boolean gas;
  
    abstract void set_num_of_wheels(int a);
    abstract void set_num_of_passengers(int a);  
  	abstract void set_gas(boolean a);
 
  
  	public String result_string(){
    	return "wheels: "+this.num_of_wheels+", passengers: "+this.num_of_passengers+", gas: "+this.gas;
  	}
}

class car extends Vehicle{
  	public void set_num_of_wheels(int a){
      num_of_wheels = a;
    };

    public void set_num_of_passengers(int a){
      num_of_passengers = a;
    };
  
  	public void set_gas(boolean a){
      gas = a;
    };  
}

class plane extends Vehicle{
  	public void set_num_of_wheels(int a){
      num_of_wheels = a;
    };

    public void set_num_of_passengers(int a){
      num_of_passengers = a;
    };
  
  	public void set_gas(boolean a){
      gas = a;
    };  
}