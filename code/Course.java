import java.util.*;

public class Course {

	Collection<Lecturer> teaches;
	public String name;
	public int id;
	public float hours;

	public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public void enrollStudentToCourse(){
		System.out.println("The method was successfully created");
	}
	public void unsubscribeStudentFromCourse(){
		System.out.println("The method was successfully created");
	}

}