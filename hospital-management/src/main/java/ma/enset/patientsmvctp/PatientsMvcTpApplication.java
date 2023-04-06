package ma.enset.patientsmvctp;

import ma.enset.patientsmvctp.entities.Patient;
import ma.enset.patientsmvctp.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcTpApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"achraf taffah",new Date(),false,57));
            patientRepository.save(new Patient(null,"taffah achraf",new Date(),true,56));
            patientRepository.findAll().forEach(p-> System.out.println(p.getName()));
        };
    }

}
