package main.java.com.openlab.biblioteca.service;

import java.util.List;

import main.java.com.openlab.biblioteca.modelo.Usuario;

public interface UsuarioService {

	public void apagarUsuarioPorId(Long id);
	public Usuario buscarUsuarioPorId(Long id);
	public Usuario buscarUsuarioPorLogin(String login);
	public Usuario gravarUsuario(Usuario usuario);
	public void alterarUsuario(Usuario usuario);
	public List<Usuario> listarUsuario();
	public void atribuirPapelParaUsuario(long idUsuario, int[] idsPapeis, boolean isAtivo);
}
