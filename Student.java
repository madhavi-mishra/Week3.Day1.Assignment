package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Student name is Madhavi");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
System.out.println("Student Department :Science");
	}
	public void studentId() {
		// TODO Auto-generated method stub
System.out.println("Student id : 21");
	}
	public static void main(String[] args) {
		System.out.println(" -----------Single  Inheritance----------");
		System.out.println("--------College Class------:");
		College coll = new College();
		coll.collegeCode();
		coll.collegeName();
		coll.collegeRank();
		System.out.println("=============Multiple Inheritance===============");		
		System.out.println("---------Department Class--------");
		Department dep = new Department();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.deptName();
		
		System.out.println("===============Multiple Inheritance=============");	
	System.out.println("----------Student Class----------");
	Student stud =new Student();
	stud.collegeCode();
	stud.collegeName();
	stud.collegeRank();
	stud.deptName();
	stud.studentDept();
	stud.studentId();
	stud.studentName();
	}
	
}

