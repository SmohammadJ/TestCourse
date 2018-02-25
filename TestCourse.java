//@code contributor: Mohammad J. Nourbakhsh
public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structure");
	
		course1.addStudent("Ali Alian");
		course1.addStudent("Hassan Hassani");
		course1.addStudent("Mahdi Mahdian");
		
		course1.dropStudent("hassan hassani");
		course1.dropStudent("hassan hassa");
		


		
		System.out.println("Number of students in course1("+course1.getCourseName()+"): "+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i <course1.getNumberOfStudents() ; i++) {
			System.out.print(students[i] + ",");
		}
		System.out.println();	
	}
}
