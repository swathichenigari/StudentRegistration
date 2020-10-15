package com.student.registration.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String houseNo;
	private String city;
	private String district;
	private String state;
	private int pincode;
	
	public Address() {
		super();
	}
}
