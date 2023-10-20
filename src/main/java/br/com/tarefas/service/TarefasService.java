package br.com.tarefas.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tarefas.entity.Tarefa;
import br.com.tarefas.repository.TarefasRepository;

@Service
public class TarefasService {
	
	@Autowired
	private TarefasRepository tarefasRepository;

	public List<Tarefa> create(Tarefa tarefa){
		tarefasRepository.save(tarefa);
		return allList();
	}
	
	public List<Tarefa> allList(){
		Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
		return tarefasRepository.findAll(sort);
	}
	
	public List<Tarefa> upDate(Tarefa tarefa){
		tarefasRepository.save(tarefa);
		return allList();
	}
	
	public List<Tarefa> delete(Long id){
		tarefasRepository.deleteById(id);
		return allList();
	}
}
