package com.momo.regularsystem;
import com.momo.regularsystem.repository.DeclarantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RegularsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(RegularsystemApplication.class, args);
	}
	@Autowired
	private DeclarantRepository declarantRepository;
	@Override
	public void run(String... args) throws Exception {

//
//		 Declarant declarant1 = new Declarant("Yeum", "Dakar", "ramesh@gmail.com","772855046");
//		 declarantRepository.save(declarant1);
//		Declarant declarant2 = new Declarant("PMN", "Dakar", "niang@gmail.com","772855046");
//		declarantRepository.save(declarant2);
	}

}
