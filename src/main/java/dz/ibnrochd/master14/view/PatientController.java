package dz.ibnrochd.master14.view;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;



@RestController
public class PatientController {

	 private final PatientRepository repository;
	 
	 PatientController(PatientRepository repository) {
		    this.repository = repository;
		  }
	 
	 
	 
	 @GetMapping("/Patient")
	  List<Patient> all() {
	    return repository.findAll();
	    
	  }
	
	 @DeleteMapping("/Patient/{id}")
	  void deleteEmployee(@PathVariable Integer id) {
	    repository.deleteById(id);;
	  }
	 
	 
	  
	  }
