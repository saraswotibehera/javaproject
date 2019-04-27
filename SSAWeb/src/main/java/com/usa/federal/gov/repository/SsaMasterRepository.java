package com.usa.federal.gov.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usa.federal.gov.entity.SSNMaster;

public interface SsaMasterRepository  extends JpaRepository<SSNMaster, Serializable>{

}
