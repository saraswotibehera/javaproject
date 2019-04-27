package com.usa.federal.gov.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.federal.gov.entity.SSNMaster;
import com.usa.federal.gov.entity.UsaStateEntity;
import com.usa.federal.gov.model.SSNModel;
import com.usa.federal.gov.repository.SsaMasterRepository;
import com.usa.federal.gov.repository.UsaStateRepository;
@Service
public class SsaServiceImpl implements SsaService {
	@Autowired
	private SsaMasterRepository ssaMasterRepo;
	@Autowired
	private UsaStateRepository usaStateRepo;

	@Override
	public Long enrollSsn(SSNModel ssnModel) {
		SSNMaster ssnMaster = new SSNMaster();
		BeanUtils.copyProperties(ssnModel, ssnMaster);
		try {
			ssnMaster.setPhoto(ssnModel.getPhoto().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ssnMaster = ssaMasterRepo.save(ssnMaster);
		System.out.println(ssnMaster.ssn);
		return ssnMaster.ssn;
	}

	@Override
	public List<SSNModel> retrieveAll() {
		List<SSNMaster> master=ssaMasterRepo.findAll();
		List<SSNModel> ssnModel=new ArrayList<>();
		if(!master.isEmpty())
		{
		for (SSNMaster ssnMaster : master) {
			SSNModel model = new SSNModel();
			BeanUtils.copyProperties(ssnMaster, model);
			ssnModel.add(model);
		}
		}
		return ssnModel;
	}
	
	@Override
	public List<SSNModel> retrieveAll(Integer pageNumber, Integer pageSize) {
		return null;
	}

	@Override
	public List<String> retrieveAllState() {
		List<UsaStateEntity> entities = usaStateRepo.findAll();
		List<String> stateName = new ArrayList<>(78);
		if (!entities.isEmpty()) {
			for (UsaStateEntity entity : entities) {
				stateName.add(entity.stateName);
			}
		}
		return stateName;

	}

}
