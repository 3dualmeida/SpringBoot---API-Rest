package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCurso_Nome(String nomeCurso);

	/**
	@Query("select * from Topico t where t.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);
	*/
}
