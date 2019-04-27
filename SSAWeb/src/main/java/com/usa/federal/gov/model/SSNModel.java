package com.usa.federal.gov.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;
//@Data
public class SSNModel {
	public Long ssn;
	public String firstName;
	public String lastName;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	public Date dob;
	public String gender;
	public MultipartFile photo;
	public String phNo;
	public String createdBy;
	public String updatedBy;
	public Date createdDate;
	public Date updatedDated;
	public String state;
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDated() {
		return updatedDated;
	}
	public void setUpdatedDated(Date updatedDated) {
		this.updatedDated = updatedDated;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "SSNModel [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", photo=" + photo + ", phNo=" + phNo + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + ", createdDate=" + createdDate + ", updatedDated=" + updatedDated
				+ ", state=" + state + "]";
	}
	
	
}
