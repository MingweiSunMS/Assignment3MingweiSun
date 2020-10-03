
public class Student {
	
	private String studentFirstName;
	private String studentLastName;
	
	
	private int studentId;
	private String emailAddress;
	
	public Student(String firstName, String lastName) {
		this.studentFirstName=firstName;
		this.studentLastName=lastName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public void setEmail(String emailAddress) {
		this.emailAddress=emailAddress;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getEmail() {
		return this.emailAddress;
	}
	
	public String getStudentName() {
		return this.studentFirstName+" "+this.studentLastName;
	}
	
}
