package main.java.com.openlab.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.openlab.biblioteca.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
