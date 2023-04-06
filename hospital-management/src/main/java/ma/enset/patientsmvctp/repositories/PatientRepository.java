package ma.enset.patientsmvctp.repositories;

import ma.enset.patientsmvctp.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNameContains(String kw, Pageable pageable);
}
