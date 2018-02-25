//@code contributor: Mohammad J. Nourbakhsh
public class Course {
	 private String courseName; 
	 private String[] students = new String[1];
	 private int numberOfStudents;
	 
	 public Course(String courseName) { 
	 this.courseName = courseName; 
	 } 
	 
	 public void addStudent(String student){
		 students[numberOfStudents] = student;
		 numberOfStudents++;
		 String[] students2 = new String[students.length + 1];
		 for (int i = 0; i < students.length; i++) {
			students2[i] = students[i];
		 }
		 this.students = students2;
	 }
	 
	 public String[] getStudents(){
		 return this.students;
	 }
	 
	 public int getNumberOfStudents(){
		 return numberOfStudents;
	 }
	 
	 public String getCourseName(){
		 return courseName;
	 }
	 
	 public void dropStudent(String student){
		 boolean flag = false;
		 for (int i = 0; i < students.length; i++) {
			if (student.equalsIgnoreCase(students[i])) {
				flag = true;
				String[] students3 = new String[students.length-1];
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						students3[j] = students[j];	
					}
					for (int j = i; j < students3.length; j++) {
						students3[j] = students[j+1];
					}
				}else {
					for (int j = 0; j < students3.length; j++) {
						students3[j] = students[j+1];
					}
				}
				this.students = students3;
				this.numberOfStudents = students.length-1;
			}
		}
		 if(!flag){
			 System.out.println("'"+student+"' Was not found to be deletet:D");
		 }
		 
	 }
	 public void clear(){
		 this.students = null;
		 this.numberOfStudents = 0;
	 }
}
