package br.edu.ifpb.gugawag.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.gugawag.api.modelo.Walker;

public interface WalkerRepositorio extends JpaRepository<Walker, Long>{

    public java.util.Optional<Walker> findById(Long id);

    public Walker findByNome(String nome);

    public Walker findByEmail(String email);

}
