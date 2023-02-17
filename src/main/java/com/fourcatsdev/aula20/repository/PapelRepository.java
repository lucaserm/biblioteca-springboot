package main.java.com.fourcatsdev.aula20.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.fourcatsdev.aula20.modelo.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
