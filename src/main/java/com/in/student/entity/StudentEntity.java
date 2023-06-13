package com.in.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {
            
	        @Id
	        @GeneratedValue(generator = "increment")
	        @Column(name="id")
	        int id;
	        
	        @Column(name="name")
	        String name;
	        
	        @Column(name="mobile_number")
	        String mobileNumber;
	        
	        @Column(name="city")
		    String city;
	        
	        @Column(name="address")
		    String address;

	        
	        
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
	        
	        
	        
	       
	    
}
