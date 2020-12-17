package dz.ibnrochd.master14.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Consultation;


	@Service
	@Transactional
	public class ConsultationService {
	 
	    @Autowired
	    private IConsultationService iConsultationService;
	     
	    public List<Consultation> listAll() {
	        return iConsultationService.findAll();
	    }
	     
	    public void save(Consultation consultation) {
	    	iConsultationService.save(consultation);
	    }
	     
	         
	    public void delete(long id) {
	    	iConsultationService.deleteById((int) id);

	    }
	}

	 
