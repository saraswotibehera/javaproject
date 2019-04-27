package com.usa.federal.gov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USA_STATE")
@Data
public class UsaStateEntity {
	@Id
	@GeneratedValue
	@Column(name="STATE_ID")
	public int stateId;
	@Column(name="STATE_NAME")
	public String stateName;
	@Column(name="STATE_CODE")
	public String stateCode;
	
	

}
