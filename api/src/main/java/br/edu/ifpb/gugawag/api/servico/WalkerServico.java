package br.edu.ifpb.gugawag.api.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.gugawag.api.modelo.Walker;
import br.edu.ifpb.gugawag.api.repositorio.WalkerRepositorio;

@Service
public class WalkerServico {
    @Autowired
    private WalkerRepositorio walkerRepositorio;

    public List<Walker> getWalkers(){
        return this.walkerRepositorio.findAll();
    }

    public Walker getWalkerPorId(Long idWalker){
        return this.walkerRepositorio.findById(idWalker).orElse(null);
    }

    public Walker inserir(Walker walker) {
        return this.walkerRepositorio.save(walker);
    }
    
    public Walker atualizar(Walker walker) {
        return this.walkerRepositorio.save(walker);
    }
    
    public void remover(Long id) {
        this.walkerRepositorio.deleteById(id);
    }
}