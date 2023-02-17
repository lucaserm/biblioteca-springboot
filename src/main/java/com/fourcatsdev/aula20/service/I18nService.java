package main.java.com.fourcatsdev.aula20.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class I18nService {

	@Autowired
	private MessageSource message; // internacionalização
	
	public String buscarMensagem(String chave, Locale locale) {
		String msn = message.getMessage(chave, null, locale);
		return msn;
	}
}
