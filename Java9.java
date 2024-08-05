// Lab 6

import java.util.Scanner;

// Created class faculty
class Faculty{
	private String sname;
	private String sdepartment;
	private double dsalary;
	private String sdesignation;
	private static int ifaculty_number = 0;	

	// Parameterless constructor
	public Faculty(){
		ifaculty_number += 1;
		sname = "user"+ifaculty_number;
		sdepartment = "unknown";
		dsalary = 0.0;
		sdesignation = "Teacher";
	}

	// Setter for name
	public void setName(String name){
		sname = name;
	}
	// Setter for department
	public void setDepartment(String dept){
		sdepartment = dept;
	}
	// Setter for designation
	public void setDesignation(String design){
		sdesignation = design;
	}
	// Setter for salary
	public void setSalary(Double salary){
		dsalary = salary;
	}


	// Getter for name
	public String getName(){
		return sname;
	}
	
	// Editing Salary
	public double CountSalary(double TA,double DA,double MA){
		double dTravellingAllowance,dDearanceAllowance,dMedicalAllowance;
		dTravellingAllowance = TA*dsalary;
		dDearanceAllowance = DA*dsalary;
		dMedicalAllowance = MA*dsalary;
		double dTotalAllowance = dTravellingAllowance+dDearanceAllowance+dMedicalAllowance;
		double dTotalSalary = dsalary*dTotalAllowance;
		return dTotalSalary;
	}
	// Getter for salary
	public double getSalary(){
		double TA=0.0,DA=0.0,MA=0.0;
		double sl=0.0;
		switch(sdesignation){
			case "Teacher":
			case "teacher":
			case "TEACHER":
				TA = 0.2;
				DA = 0.2;
				MA = 0.1;
				break;
			case "HOD":
			case "hod":
			case "Hod":
				TA = 0.3;
				DA = 0.35;
				MA = 0.24;
				break;
			case "Professor":
			case "PROFESSOR":
			case "professor":	
				TA = 0.28;
				DA = 0.23;
				MA = 0.18;
				break;
			case "Lecturer":
			case "LECTURER":
			case "lecturer":
				TA = 0.2;
				DA = 0.25;
				MA = 0.15;
				break;
		}
		sl =  CountSalary(TA,DA,MA);
		return sl;
	}


	// Getter for designation
	public String getDesignation(){
		return sdesignation;
	} 
	// Getter for department
	public String getDepartment(){
		return sdepartment;
	}
}

public class Java9{
	public static void main(String[] args){
		// Creating faculty objects
		// Object 1
		Faculty f1 = new Faculty();
		addFaculty(f1);
		//System.out.println("Faculty name is "+f1.getName());
		// Object 2
		Faculty f2 = new Faculty();
		addFaculty(f2);
		//System.out.println("Faculty name is "+f2.getName());
		// Object 3
		Faculty f3 = new Faculty();
		addFaculty(f3);
		//System.out.println("Faculty name is "+f3.getName());
		getFacultyData(f1);
		getFacultyData(f2);
		getFacultyData(f3);
	}

	public static void getFacultyData(Faculty f){
		System.out.println("Name : "+f.getName());
		System.out.println("Department : "+f.getDepartment());
		System.out.println("Designation : "+f.getDesignation());
		System.out.println("Salary : "+f.getSalary());
	}

	public static void addFaculty(Faculty f){
		Scanner sc = new Scanner(System.in);
		String name,dept,design;
		double salary;
		System.out.println("");
		System.out.print("Enter name of faculty : ");
		name = sc.nextLine();
		f.setName(name);
		System.out.print("Enter department of faculty : ");
		dept = sc.nextLine();
		f.setDepartment(dept);
		System.out.print("Enter designation of faculty : ");
		design = sc.nextLine();
		f.setDesignation(design);
		System.out.print("Enter salary of faculty (Monthly) : ");
		salary = sc.nextDouble();
		f.setSalary(salary);
		sc.nextLine();
		sc.close();
	}
}