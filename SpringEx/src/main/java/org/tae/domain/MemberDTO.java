package org.tae.domain;

public class MemberDTO {
	
	//  id
	private String id;
	// passowrd 
	private String password;
	// name
	private String name;
	
	// ������� 
	
	//��
	private String year;
	//��
	private String month;
	 
	//��
	private String day;
	
	//���� 
	private String gender;
	
	//�̸���
	private String email;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", year=" + year + ", month="
				+ month + ", day=" + day + ", gender=" + gender + ", email=" + email + "]";
	}
	
}
	