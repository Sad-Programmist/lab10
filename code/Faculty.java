public class Faculty {

	public Employee dean;
	public String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public void enrollStudentInFaculty(){
		System.out.println("The method was successfully created");
	}
	public void hireLecturerAtFaculty(){
		System.out.println("The method was successfully created");
	}
}