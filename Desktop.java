package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		// TODO Auto-generated method stub
System.out.println("Most modern monitor screen sizes range from less than 21 inches to well over 30");
	}
	
public static void main(String[] args) {
	System.out.println("Called method using computer obj : ");
	Computer comp = new Computer();
	comp.computerModel(); 
	
	System.out.println("called methods into the Desktop using single inheritance :");
	Desktop desk = new Desktop();
	desk.computerModel();
	desk.desktopSize();
	
}
	
}
//*Assignment1: * 
//===========
//   Package   :org.system
//   Class        :Computer
//   Methods   :computerModel()
//
//   Class        :Desktop
//   Methods   :desktopSize()
//
//Description:
//create above 2 class and call all your class methods into the Desktop using single inheritance.