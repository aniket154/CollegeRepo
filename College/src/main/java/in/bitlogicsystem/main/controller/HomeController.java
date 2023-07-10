package in.bitlogicsystem.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.bitlogicsystem.main.model.College;
import in.bitlogicsystem.main.service.CollegeService;

@RestController
public class HomeController {
	
	@Autowired
	CollegeService collegeservice;
	
	public College saveData()
	{
		return null;
	}
	

}
