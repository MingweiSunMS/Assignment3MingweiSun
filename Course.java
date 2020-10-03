
public class Course {

	private String courseName;
	private Student[] studentInCourse = new Student[10];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return this.courseName;
	}
	
	public void addStudent(Student student) {

		// check duplicate student input

		if (ifFull()) {
			System.out.println("This course exceed its maximum num. We are unablre to add "+ student.getStudentName());
		} else {
			for (int i = 0; i < 10; i++) {
				if (studentInCourse[i] == null) {
					studentInCourse[i] = student;
					break;
				} else {
					if (studentInCourse[i].getStudentId() == student.getStudentId()) {
						System.out.println("This student is already in the list!");
						break;
					}
				}
			}
		}

	}

	public void getStudentInCourse() {
		int count=0;
		System.out.println("Students in " + this.courseName + " are: ");
		for (int i = 0; i < 10; i++) {
			if (studentInCourse[i] != null) {
				System.out.println(studentInCourse[i].getStudentName());
				count++;
			}
		}
		System.out.println("There are "+count+" students in the course now");
	}

	public boolean ifFull() {
		return (studentInCourse[9] != null);
	}
}
