package mydemo1.patient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientController1 
{

	@RequestMapping("/Details")
	public String home() 
	{
		return "index";
	}
	
	
	
}
