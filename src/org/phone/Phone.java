package org.phone;

public class Phone {
	// different datatype order in arguments
	public void phoneInfo(String phname, String model) {
		System.out.println("Phone name and model is "+ phname + "\n"+ model);
	}
	public void phoneInfo(long imeiNo, String camera) {
		System.out.println("Phone imeino and camera is "+ imeiNo + "\n"+ camera);
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("samsung", "Galaxy note 20");
		p.phoneInfo(2345678910l, "108MP");
	}
	
}
