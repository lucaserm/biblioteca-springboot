package main.java.com.openlab.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.openlab.biblioteca.modelo.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
