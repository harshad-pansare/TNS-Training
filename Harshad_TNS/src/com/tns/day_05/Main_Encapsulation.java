package com.tns.day_05;

public class Main_Encapsulation {
	
	public static void main(String[] args) {
		
		// object creation
		Encapsulation obj = new Encapsulation();
		obj.setAge(23);
		obj.setName("Harshad");
		obj.setSerial_num(1024);
		System.out.println(obj);
		
		System.out.println("name = " + obj.getName() + " Age = " + obj.getAge() + " Serial number = " + obj.getSerial_num());
		
	}

}
