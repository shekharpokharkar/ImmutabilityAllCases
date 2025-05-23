package com.SeleniumExpress;

public class Address {

	private String lane1;
	private String lane2;
	private String city;
	private String country;

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(Address address) {
		new Address(address.lane1, address.lane2, address.city, address.country);

	}

	public Address getInstance() {
		return new Address(lane1, lane2, city, country);

	}

	public Address(String lane1, String lane2, String city, String country) {

		this.lane1 = lane1;
		this.lane2 = lane2;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		System.out.println("===========================");
		return "Address [lane1=" + lane1 + ", lane2=" + lane2 + ", city=" + city + ", country=" + country + "]";
	}

}
