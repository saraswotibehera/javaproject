package com.usa.federal.gov.service;

import java.util.List;

import com.usa.federal.gov.model.SSNModel;

public interface SsaService {
	public Long enrollSsn(SSNModel model);
	public List<SSNModel> retrieveAll();
	public List<SSNModel> retrieveAll(Integer pageNumber,Integer pageSize);
	public List<String> retrieveAllState();
}
