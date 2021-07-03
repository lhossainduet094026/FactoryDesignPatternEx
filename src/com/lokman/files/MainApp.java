package com.lokman.files;

public class MainApp {

	public static void main(String[] args) {
		PhoneFactory factory = new PhoneFactory();
        Phone aPhone = factory.getPhone("Windows");
        aPhone.makeCall();   
	}

}
