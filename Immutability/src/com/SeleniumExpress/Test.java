package com.SeleniumExpress;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Address homeAdress = new Address("pimpalgan Road", "S Corner", "Manchar", "India");
		List<String> topanName = new ArrayList<>();
		topanName.add("Ram");
		topanName.add("shyam");
		topanName.add("Ganu");
		topanName.add("Rahul");
		Employee shekhar = new Employee("shekhar", "Pune", 1, homeAdress, topanName);

		System.out.println(shekhar);
		Address address = shekhar.getAddress();
		address.setCity("Pimpalgaion Khadki");

		List<String> topanName2 = shekhar.getTopanName();
		topanName2.add("Lala");
		System.out.println(shekhar);
	}

}
