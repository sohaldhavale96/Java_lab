import java.util.Scanner;
// Lab 2
class Java3{
	public static void main(String args[]){
		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		// System.out.println("Two numbers are "+num1+" and "+num2+".");
		System.out.println("Enter information of First Employee >> ");
		Employee e1 = new Employee();
		e1.setFirstName();
		e1.setLastName();
		e1.setSalary();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Enter information of second Employee >> ");
		Employee e2 = new Employee();
		e2.setFirstName();
		e2.setLastName();
		e2.setSalary();
		System.out.println("-------------------------------------------------------------\n");
		System.out.println("Information of Employee in the company is as follows :");
		System.out.println(e1.getFirstName()+"     "+e1.getLastName()+"     "+e1.getSalary()+"     "+e1.getYearlySalary()+"     "+e1.percantageGraceSalary());
		System.out.println(e2.getFirstName()+"     "+e2.getLastName()+"     "+e2.getSalary()+"     "+e2.getYearlySalary()+"     "+e2.percantageGraceSalary());
	}
}

class Employee{
	private String firstName;
	private String lastName;
	private int salary;
	Scanner sc = new Scanner(System.in);
	Employee(){
		firstName = "";
		lastName = "";
		salary = 0;
	}
	void setFirstName(){
		System.out.print("Enter first name of employee : ");
		firstName = sc.next();
	}
	void setLastName(){
		System.out.print("Enter last name of employee : ");
		lastName = sc.next();
	}
	void setSalary(){
		System.out.print("Enter salary of employee : ");
		salary = sc.nextInt();
	}
	String getFirstName(){
		return firstName;
	}
	String getLastName(){
		return lastName;
	}
	int getSalary(){
		return salary;
	}
	int getYearlySalary(){
		return 12*salary;
	}
	float percantageGraceSalary(){
		float inc = (getYearlySalary()*0.1f)+getYearlySalary();
		return inc;
	}
}