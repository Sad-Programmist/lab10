import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public void startProject(){
		System.out.println("The method was successfully created");
	}
	public void finishProject(){
		System.out.println("The method was successfully created");
	}
}