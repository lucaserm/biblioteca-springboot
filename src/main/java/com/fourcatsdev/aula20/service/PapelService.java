package main.java.com.fourcatsdev.aula20.service;

import java.util.List;

import main.java.com.fourcatsdev.aula20.modelo.Papel;

public interface PapelService {
	public Papel buscarPapelPorId(Long id);
	public Papel buscarPapel(String papel);
	public List<Papel> listarPapel();
}
