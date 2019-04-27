package com.usa.federal.gov.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Entity
@Table(name="SSA_MASTER")
@Data
public class SSNMaster {
@Id
@GeneratedValue(generator="ssn_seq_gen")
@SequenceGenerator(
		name="ssn_seq_gen",
		sequenceName="ssn_seq",
		initialValue=88812011,
		allocationSize=1
		
		)
@Column(name="SSN")
public Long ssn;
@Column(name="FIRST_NAME")
public String firstName;
@Column(name="LAST_NAME")
public String lastName;
@Column(name="DOB")
public Date dob;
@Column(name="GENDER")
public String gender;
@Column(name="PHOTO")
@Lob
public byte[] photo;
@Column(name="PHONE_NO")
public String phNo;
@Column(name="STATE")
public String state;
@Column(name="CREATED_BY")
public String createdBy;
@Column(name="UPDATED_BY")
public String updatedBy;
@Column(name="CREATED_DATE")
@CreationTimestamp
@Temporal(TemporalType.DATE)
public Date createdDate;
@Column(name="UPDATED_DATE")
@UpdateTimestamp
@Temporal(TemporalType.DATE)
public Date updatedDate;
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
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}
public String getPhNo() {
	return phNo;
}
public void setPhNo(String phNo) {
	this.phNo = phNo;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
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
public Date getUpdatedDate() {
	return updatedDate;
}
public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}
@Override
public String toString() {
	return "SSNMaster [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
			+ ", gender=" + gender + ", photo=" + Arrays.toString(photo) + ", phNo=" + phNo + ", state=" + state
			+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdDate=" + createdDate
			+ ", updatedDate=" + updatedDate + "]";
}

}
