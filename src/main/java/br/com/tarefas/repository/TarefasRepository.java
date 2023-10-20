package br.com.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tarefas.entity.Tarefa;

public interface TarefasRepository extends JpaRepository<Tarefa, Long>{
}
