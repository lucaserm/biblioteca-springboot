package main.java.com.fourcatsdev.aula20.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import main.java.com.fourcatsdev.aula20.modelo.Papel;
import main.java.com.fourcatsdev.aula20.repository.PapelRepository;

@Component
public class CarregadoraDados implements CommandLineRunner {

	@Autowired
	private PapelRepository papelRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		String[] papeis = {"ADMIN", "USER", "BIBLIOTECARIO"};
		
		for (String papelString: papeis) {
			Papel papel = papelRepository.findByPapel(papelString);
			if (papel == null) {
				papel = new Papel(papelString);
				papelRepository.save(papel);
			}
		}				
	}

}
