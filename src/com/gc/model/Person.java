package com.gc.model;



public class Person  {
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String gender;
	private String[] favorites;
	
	
	public Person() {
		// this is just an example to show that you can still initialize variables even though we are not taking in parameters
		firstName = "";
		lastName = "";
		phoneNum = "";
		gender = "";
		favorites = null;
	}


	public Person(String firstName, String lastName, String phoneNum, String gender, String[] favorites) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.gender = gender;
		this.favorites = favorites;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String[] getFavorites() {
		return favorites;
	}


	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getPhoneNum() + " " + getGender();
	}

}
