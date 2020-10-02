package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista(){
		Topico topico = new Topico("Topico 1", "Teste 1", new Curso("Spring", "Programação"));
		Topico topico1 = new Topico("Topico 2", "Teste 2", new Curso("Spring2", "Programação2"));
		
		return Arrays.asList(topico, topico1);
	}
}
