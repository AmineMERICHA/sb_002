package dz.ibnrochd.master14.business;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.model.Traitement;

@Service
@Transactional
public class TraitementService {
	  @Autowired
	  private ITraitementService iTraitementService;
	     
	    public List<Traitement> listAll() {
	        return iTraitementService.findAll();
	    }
	     
	    public void save(Traitement traitement) {
	    	iTraitementService.save(traitement);
	    }
	     
	    public Traitement get(long id) {
	        return iTraitementService.findById((int) id).get();
	    }
	     
	    public void delete(long id) {
	    	iTraitementService.deleteById((int) id);
}
	  
}