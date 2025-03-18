package br.edu.ifpb.gugawag.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.gugawag.api.modelo.Passeio;

public interface PasseioRepositorio extends JpaRepository<Passeio, Long>
{

    public java.util.Optional<Passeio> findById(Long id);

    public Passeio findByDataHora(String dataHora);

}
