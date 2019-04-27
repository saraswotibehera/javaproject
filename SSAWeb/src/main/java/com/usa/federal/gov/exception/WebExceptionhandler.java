package com.usa.federal.gov.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebExceptionhandler {
	@ExceptionHandler(value=ArithmeticException.class)
public String exception(Model model)
{
	model.addAttribute("exception","try after sometime");
	return "model" ;
	
}
}
