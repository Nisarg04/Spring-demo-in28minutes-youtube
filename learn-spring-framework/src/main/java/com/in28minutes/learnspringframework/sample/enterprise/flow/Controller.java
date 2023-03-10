package com.in28minutes.learnspringframework.sample.enterprise.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;

//Sending response in the right format
@RestController
public class Controller {
	@Autowired
	private BusinessService businessService;
	@GetMapping("/sum")
	public long displaySum()
	{
		return businessService.calculateSum();
	}
	
}





