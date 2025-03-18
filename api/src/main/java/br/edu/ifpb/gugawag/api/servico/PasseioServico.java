package br.edu.ifpb.gugawag.api.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.gugawag.api.modelo.Passeio;
import br.edu.ifpb.gugawag.api.repositorio.PasseioRepositorio;

@Service
public class PasseioServico {
    @Autowired
    private PasseioRepositorio passeioRepositorio;

    public List<Passeio> getPasseios(){
        return this.passeioRepositorio.findAll();
    }

    public Passeio getPasseioPorId(Long idPasseio){
        return this.passeioRepositorio.findById(idPasseio).orElse(null);
    }

    public Passeio inserir(Passeio passeio) {
        return this.passeioRepositorio.save(passeio);
    }
    
    public Passeio atualizar(Passeio passeio) {
        return this.passeioRepositorio.save(passeio);
    }
    
    public void remover(Long id) {
        this.passeioRepositorio.deleteById(id);
    }

}