public abstract class Employee {

	public int ssNo;
	public String name;
	public String email;
	public int counter;

	public Employee(int ssNo, String name, String email, int counter) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.counter = counter;
	}

	public void hire(){
		System.out.println("The method was successfully created");
	}
	public void fire(){
		System.out.println("The method was successfully created");
	}
}