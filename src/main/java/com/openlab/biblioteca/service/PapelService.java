package main.java.com.openlab.biblioteca.service;

import java.util.List;

import main.java.com.openlab.biblioteca.modelo.Papel;

public interface PapelService {
	public Papel buscarPapelPorId(Long id);
	public Papel buscarPapel(String papel);
	public List<Papel> listarPapel();
}
