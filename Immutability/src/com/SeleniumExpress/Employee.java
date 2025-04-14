package com.SeleniumExpress;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

	private final String employeeName;
	private final String employeeCity;
	private final Integer employeeId;
	private final List<String> topanName;
	private final Address address;

	public String getEmployeeCity() {
		return employeeCity;
	}

	public Address getAddress() {
		return new Address(address);
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee(String employeeName, String employeeCity, Integer employeeId, Address address,
			List<String> topanName1) {

		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		this.employeeId = employeeId;
		this.topanName = new ArrayList<>();

		for (String str : topanName1) {
			topanName.add(str);
		}
		this.address = address;
	}

	public List<String> getTopanName() {
		List<String> topanName12 = new ArrayList<>();

		for (String str : topanName) {
			topanName12.add(str);
		}

		return topanName12;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + ", employeeId="
				+ employeeId + ", topanName=" + topanName + ", address=" + address + "]";
	}

}
