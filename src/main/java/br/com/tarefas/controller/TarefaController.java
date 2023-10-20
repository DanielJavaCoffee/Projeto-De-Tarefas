package br.com.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefas.entity.Tarefa;
import br.com.tarefas.service.TarefasService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefas")
public class TarefaController {
	
	@Autowired
	private TarefasService tarefasService;
	
	@PostMapping
	@Transactional
	public ResponseEntity<Tarefa> create(@RequestBody @Valid Tarefa tarefa){
		tarefasService.create(tarefa);
		return null;
	}
}
