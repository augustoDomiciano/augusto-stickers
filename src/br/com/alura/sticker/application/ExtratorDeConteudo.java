package br.com.alura.sticker.application;

import java.util.List;

public interface ExtratorDeConteudo {
	
	List<Conteudo> extraiConteudos(String json);

}
