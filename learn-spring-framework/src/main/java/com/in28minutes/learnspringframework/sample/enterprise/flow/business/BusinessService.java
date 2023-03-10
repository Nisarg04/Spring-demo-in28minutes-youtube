package com.in28minutes.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprise.flow.data.DataService;

//Business Logic
@Component
public class BusinessService{
	@Autowired
	private DataService dataservice;
	
	public long calculateSum()
	{
		List<Integer> data=dataservice.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}