package com.in.student.dto;

public class Student {
           
	     int id;
	     String name;
	     String mobileNumber;
	     String city;
	     String address;
	    
	     
	     
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String name, String mobileNumber, String city, String address) {
			super();
			this.id = id;
			this.name = name;
			this.mobileNumber = mobileNumber;
			this.city = city;
			this.address = address;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", city=" + city
					+ ", address=" + address + "]";
		}
	     
	     
	     
	     
	     
}
