package constructors;

public class TestLaptop {

	public static void main(String[] args) {
       Laptop laptop1 = new Laptop();
       laptop1.getname("MacBook Pro");
       laptop1.displayname();
       laptop1.setnumber(15);
       
       // static method
       Laptop jessy = new Laptop();
          jessy.getmemory(16);
          int jessylaptopmemory = jessy.setmemory();
          System.out.println("jessy laptop memory is : " + jessylaptopmemory + "gb");
          
          Laptop jenny = new Laptop();
          jenny.getmemory(32);
          int jennylaptopmemory = jenny.setmemory();
          System.out.println("jenny laptop memory is :" + jennylaptopmemory + "gb");
          
          int jessylaptopmemoryafter = jessy.setmemory();
          System.out.println("jessy laptop memory after is : " + jessylaptopmemoryafter + "gb");
        
          // static method 
          Laptop.joellaptopversion();
          
          //non static
          Laptop jes = new Laptop();
          jes.getversion(10);
          double jeslaptopversion = jes.displayversion();
          System.out.println("Jes laptop version is : " + jeslaptopversion );
          
          Laptop jen = new Laptop();
          jen.getversion(9);
          double jenlaptopversion = jen.displayversion();
          System.out.println("Jen laptop version is : " + jenlaptopversion );
          
          double jeslaptopversionAfter = jes.displayversion();
          System.out.println("Jes laptop version after is : " + jeslaptopversionAfter );
   
	}

}
