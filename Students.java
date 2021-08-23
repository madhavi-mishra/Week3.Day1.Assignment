package week3.day1.assignment;

public class Students {
	public void getStudentInfo() {
		// TODO Auto-generated method stub
System.out.println("Get Student Information");
	}
	public void getStudentInfo(int id) {
		System.out.println("Get id of Student : " + id);
	}
	public void getStudentInfo(int id  ,String name) {
		System.out.println("Get Student id : "+id);
		System.out.println("Get Student name : "+name);
	}
	public void getStudentInfo(String email  ,String phoneNumber) {
		System.out.println("Get Student id : "+email);
		System.out.println("Get Student name : "+phoneNumber);
	}
	
	public static void main(String[] args) {
		System.out.println("==============Overloading Method===============");
		Students studInfo = new Students();
		studInfo.getStudentInfo();
		studInfo.getStudentInfo(21);
		studInfo.getStudentInfo(16," Madhavi");
		studInfo.getStudentInfo("madhavi@gmail.com", "1234567890");
		
	}	
}
//Assignment4:
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber