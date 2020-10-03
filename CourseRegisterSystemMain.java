

public class CourseRegisterSystemMain {

	public static void main(String[] args) {
		
		//Assignment3 part 1
		Student student1=new Student("John","Smith");
		student1.setEmail("hellojohn@gmail.com");
		student1.setStudentId(10001);
		
		System.out.println("Test student method, getStudentName, getStudentEmail and getStudentId");
		System.out.println(student1.getStudentName());
		System.out.println(student1.getEmail());
		System.out.println(student1.getStudentId());
		
		Student student2=new Student("Test","Student2");
		student2.setEmail("testStudent2@gmail.com");
		student2.setStudentId(10002);
		
		Course course1=new Course("Math");
		course1.addStudent(student1);
		
		System.out.println("\nTest add student with the same id. Will return the message and not added");
		course1.addStudent(student1);
		course1.addStudent(student2);
		
		System.out.println("Test get Course Methods: getStudentInCourse, isFull");
		course1.getStudentInCourse();
		System.out.println("Check if the course is full: "+ course1.ifFull());
		
		//Add the rest of students into the Course to test if can show the limt
		Student student3=new Student("Test","Student3");
		student3.setEmail("testStudent3@gmail.com");
		student3.setStudentId(10003);
		
		Student student4=new Student("Test","Student4");
		student4.setEmail("testStuden42@gmail.com");
		student4.setStudentId(10004);
		
		Student student5=new Student("Test","Student5");
		student5.setEmail("testStudent5@gmail.com");
		student5.setStudentId(10005);
		
		Student student6=new Student("Test","Student6");
		student6.setEmail("testStudent6@gmail.com");
		student6.setStudentId(10006);
		
		Student student7=new Student("Test","Student7");
		student7.setEmail("testStuden7@gmail.com");
		student7.setStudentId(10007);
		
		Student student8=new Student("Test","Student8");
		student8.setEmail("testStudent8@gmail.com");
		student8.setStudentId(10008);
		
		Student student9=new Student("Test","Student9");
		student9.setEmail("testStudent9@gmail.com");
		student9.setStudentId(10009);
		
		Student student10=new Student("Test","Student10");
		student10.setEmail("testStudent10@gmail.com");
		student10.setStudentId(10010);
		
		course1.addStudent(student3);
		course1.addStudent(student4);
		course1.addStudent(student5);
		course1.addStudent(student6);
		course1.addStudent(student7);
		course1.addStudent(student8);
		course1.addStudent(student9);
		course1.addStudent(student10);
		
		System.out.println("Test get Course Methods: getStudentInCourse, isFull");
		course1.getStudentInCourse();
		System.out.println("Check if the course is full: "+ course1.ifFull());
		
		Student student11=new Student("Test","Student11");
		student11.setEmail("testStudent11@gmail.com");
		student11.setStudentId(10011);
		
		course1.addStudent(student11);

	}

}
