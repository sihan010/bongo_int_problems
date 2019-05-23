public class Abstraction
{
  public static void main(String[] args)
  {
    car c = new car();
    c.set_num_of_wheels(4);
    c.set_num_of_passengers(4);
    System.out.println(c.getResult());
    
    plane p = new plane();
    p.set_num_of_wheels(16);
    p.set_num_of_passengers(250);
    System.out.println(p.getResult());
  }
}

interface Vehicle{
	int set_num_of_wheels(int a);
	int set_num_of_passengers(int a);
	boolean has_gas();
}

class car implements Vehicle{
  	private int num_of_wheels;
  	private int num_of_passengers;
  	private boolean hasGas = false;
  

    public int set_num_of_wheels(int p){
      this.num_of_wheels=p;
      return num_of_wheels;
    }
  

    public int set_num_of_passengers(int p){
      this.num_of_passengers=p;
      return num_of_passengers;
    }
  

    public boolean has_gas(){
      return hasGas;
    }
  
    public String getResult(){
      return "Car wheels: "+num_of_wheels+", passangers: "+num_of_passengers+", has gas: "+hasGas;
    }
}

class plane implements Vehicle{
  	private int num_of_wheels;
  	private int num_of_passengers;
  	private boolean hasGas = true;
  

    public int set_num_of_wheels(int p){
      this.num_of_wheels=p;
      return num_of_wheels;
    }
  

    public int set_num_of_passengers(int p){
      this.num_of_passengers=p;
      return num_of_passengers;
    }
  

    public boolean has_gas(){
      return hasGas;
    }
  
    public String getResult(){
      return "Plane wheels: "+num_of_wheels+", passangers: "+num_of_passengers+", has gas: "+hasGas;
    }
}