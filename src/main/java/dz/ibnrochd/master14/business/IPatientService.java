package dz.ibnrochd.master14.business;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Patient;

@Repository

public interface IPatientService extends JpaRepository<Patient, Integer>{

}
