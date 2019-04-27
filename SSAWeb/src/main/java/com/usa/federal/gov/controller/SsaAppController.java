package com.usa.federal.gov.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usa.federal.gov.constant.AppConstant;
import com.usa.federal.gov.model.SSNModel;
import com.usa.federal.gov.properties.SsaAppProperties;
import com.usa.federal.gov.service.SsaService;
@Controller
public class SsaAppController {
	@Autowired
	private SsaService service;
	@Autowired
	private SsaAppProperties ssaAppProperties;
	
	@RequestMapping(value= {"/"},method=RequestMethod.GET)
	public String displayEnrollForm(Model model)
	{
		SSNModel ssnModel=new SSNModel();
		model.addAttribute("ssnModel",ssnModel);
		System.out.println("Welocme");
		formValue(model);
		return "ssnEnroll";
	}
	
	@RequestMapping(value="/ssnEnroll", method=RequestMethod.POST)
	public String enrollSsn(@ModelAttribute("ssnModel")SSNModel ssnModel,Model model)
	{
		int i=10/0;
		Long ssn=service.enrollSsn(ssnModel);
		Map<String,String> prop=ssaAppProperties.getSsaProps();
		if(ssn>0 && ssn!=null)
		{
			model.addAttribute(AppConstant.SUCCESS_MESSAGE,prop.get(AppConstant.SUC_MESSAGE));
			
		}
		else
		{
			model.addAttribute(AppConstant.FAILURE_MESSAGE,prop.get(AppConstant.FAIL_MESSAGE));
		}
		formValue(model);
		
		return "ssnEnroll";
	}
	@RequestMapping(value="/enrolldata")
	public String displayEnroll(Model model)
	{
		List<SSNModel>ssnModel=service.retrieveAll();
		model.addAttribute("ssnModel",ssnModel);
		
		return "enrolldata";
		
	}
	public void formValue(Model model)
	{
		List<String> genderList=new ArrayList<>();
		genderList.add("Male");
		genderList.add("Fe-Male");
		model.addAttribute("gender",genderList);
		List<String> states=service.retrieveAllState();
		model.addAttribute("state",states);
	}
	//local exception handling
	/*@RequestMapping(value="/exception")
	@ExceptionHandler(value=ArithmeticException.class)
	public String enrollexception(Model model)
	{ 
		
		model.addAttribute("exceptions","try after sometime");
		return "error";
	}*/
}
