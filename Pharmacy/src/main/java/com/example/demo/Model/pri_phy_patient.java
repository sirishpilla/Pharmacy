package com.example.demo.Model;

import java.sql.Date; 

public class pri_phy_patient {

	private String ssn;

	private String name;

	private String address;

	private Date birth_date;
	
	
	private String phy_ssn;

	/*
	 * protected pri_phy_patient(long ssn,String name,String address,int age) {
	 * this.ssn=ssn; this.name=name; this.address=address; this.age=age;
	 * 
	 * }
	 */

	public pri_phy_patient() {

	}

	public String getSsn() {
		return ssn;
	}

	/*public void setSsn(String ssn) {
		this.ssn = ssn;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public void setSsn(String ssn) {
		// TODO Auto-generated method stub
		this.ssn=ssn;
		
	}

	public String getPhy_ssn() {
		return phy_ssn;
	}

	public void setPhy_ssn(String phy_ssn) {
		this.phy_ssn = phy_ssn;
	}



}
