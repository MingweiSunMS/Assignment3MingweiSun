public class Professor{
	
	//Required Info
	private String firstName;
	private String lastName;
	private int id;
	
	//Optional
	private String email;
	private int age;
	
	public static class Builder{
		
		private String firstName;
		private String lastName;
		private int id;
		
		private String email;
		private int age;
		
		public Builder(String firstName, String lastName, int id) {
			this.firstName=firstName;
			this.lastName=lastName;
			this.id=id;
		}
		
		public Builder setEmail(String email){
			this.email=email;
			return this;
		}
		
		public Builder setAge(int age) {
			this.age=age;
			return this;
		}
		
		public Professor build() {
			return new Professor(firstName, lastName, id, email, age);
		}	
	}
	
	public Professor(String firstName, String lastName, int id, String email, int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.email=email;
		this.age=age;
	}
	
	public String getFirstName() {	
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
}

class Main {
	public static void main(String[] args) {
		Professor prof1=new Professor.Builder("Test", "Prof1", 1001)
				.setAge(50)
				.setEmail("testProf1@gmail.com").build();
		
		System.out.println("The professor's info is: \n Name: "+prof1.getFirstName()+" "+prof1.getLastName()
		+"\n ID is: "+prof1.getId()+"\n Age is: "+prof1.getAge()+"\n Email is: "+prof1.getEmail());
	}
}



