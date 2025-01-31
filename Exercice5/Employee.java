public class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int Salary;
	
	public Employee(int id, String firstName, String lastname, 
			int Salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getSalary() {
		return this.Salary;
	}
	
	public void setSalary(int salary) {
		this.Salary=salary;
	}
	
	public int getAnnualSalary() {
		return this.Salary*12;
	}
	
	public int raiseSalary(int percent) {
		return this.Salary*((100+percent)/100);
	}
	
	public String toString() {
		return "L'employé s'appelle : "+this.firstName + this.lastName;
	}
}