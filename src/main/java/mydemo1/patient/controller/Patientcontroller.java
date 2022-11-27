package mydemo1.patient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mydemo1.patient.model.Patient;
import mydemo1.patient.repository.Patientinterface;

@RestController
@RequestMapping("/api")
public class Patientcontroller {
	
	
	@Autowired
	Patientinterface patientinterface;
	
	@RequestMapping("/patient")
	public List<Patient> getAllDetails(@RequestParam(required=false) String name)
	{
		return patientinterface.findAll();
	}
	
	@RequestMapping("/Pateint/{id}")
    public Optional<Patient> findCustomerById(@PathVariable("id") String id) {
        System.out.println(id);
        return patientinterface.findById(id);
    }
    
    
    
    

	
	
	@PostMapping("/patientdetails")
	public Patient createpatient(@RequestBody Patient patient)
	{
		return patientinterface.save(patient);
	}
	
	
	
	

}
