package mydemo1.patient.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mydemo1.patient.model.Patient;

@Repository
public interface Patientinterface extends MongoRepository<Patient, String>{
	 
	 

}
