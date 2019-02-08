package constructors;

public class Laptop {
	public String name;
	public int modelNumber;
	public double version;

	public static int memory;
		
	
	// constructors
	public Laptop() {}
	public Laptop(String name) {
		this.name = name;
		System.out.println(name);
	}
	public Laptop(int modelNumber) {
		this.modelNumber = modelNumber;
		System.out.println(modelNumber);
	}
	public void getname(String name) {
		this.name = name;
	}
	public void displayname() {
		System.out.println(this.name);
	}
	public void setnumber(int modelNumber) {
		this.modelNumber = modelNumber;
		System.out.println(this.modelNumber + "inch " );
	}
	public void getmemory(int memory) {
		this.memory = memory;
	}
	public int setmemory() {
		return memory;
	}
	public static void joellaptopversion() {
		System.out.println("joel laptop version is : " + 10);
	}
	public void getversion(double version) {
		this.version = version;
	}
	public double displayversion() {
		return this.version;
	}
	
	

}
