import java.util.Scanner;
import java.util.Arrays;

public class Java11 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");

        // Creating a Student object
        Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student s4 = new Student();
	Student s5 = new Student();
        s3.setMarks(5);
        double average = s3.calAvg();
	System.out.println("name : "+s3.getName());
        System.out.println("Average: " + average);

        // Creating an Employee object
        Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();
	Employee e4 = new Employee();
    }
}

class Person {
    protected String name;
    protected String birthdate;
    protected double height;
    protected double weight;
    protected String address;
    private static int count = 0;

    public Person() {
        System.out.println("Person's default constructor");
        count += 1;
        name = "Person" + count;
        birthdate = "1/1/2001";
        height = 5.00d;
        weight = 60.00d;
        address = "ichalkaranji";
    }

	public String getname(){
		return name;
	}

    public int getcount() {
        return count;
    }

    public int CalculateAge() {
        System.out.println("Calculate age function");
        return 0;
    }
}

class Student extends Person {
    private int roll_no;
    private int numofsubjects = 0;
    private double[] marks;

    public Student() {
        System.out.println("Student constructor called");
        roll_no = super.getcount();
    }

	public String getName(){
		return super.getname();
	}

    public void setMarks(int numofsubjects) {
        this.numofsubjects = numofsubjects;
        marks = new double[numofsubjects];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numofsubjects; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + " : ");
            marks[i] = sc.nextDouble();
        }
        sc.close();
    }

    public double calAvg() {
        System.out.println("Avg marks function");
        double sum = 0.0d;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

class Employee extends Person {
    private String empId;
    private int salary;

    public Employee() {
        System.out.println("Employee constructor called");
        empId = "Employee" + super.getcount();
        salary = 12000;
    }

    public double calTax() {
        System.out.println("Tax calculating");
        return 0.0d;
    }
}