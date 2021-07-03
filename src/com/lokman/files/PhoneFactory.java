package com.lokman.files;

public class PhoneFactory {

	public Phone getPhone(String phoneName) {
		if (phoneName.equals("Android")) {
			return new AndroidPhone();
		} else if (phoneName.equals("Iphone")) {
			return new Iphone();
		} else {
			return new Windows();
		}
	}
}