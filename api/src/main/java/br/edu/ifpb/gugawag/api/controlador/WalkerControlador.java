package br.edu.ifpb.gugawag.api.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ifpb.gugawag.api.modelo.Walker;
import br.edu.ifpb.gugawag.api.servico.WalkerServico;

import java.util.List;

@RestController
@RequestMapping("/walkers")
public class WalkerControlador {
    
    @Autowired
    private WalkerServico walkerServico;
    
    @GetMapping
    public List<Walker> listar() {
        return this.walkerServico.getWalkers();
    }
    
    @PostMapping
    public Walker inserir(@RequestBody Walker walker) {
        return this.walkerServico.inserir(walker);
    }
    
    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Long id) {
        this.walkerServico.remover(id);
    }
    
   @PutMapping("/{id}")
   public Walker atualizar(@RequestBody Walker walker) {
        return this.walkerServico.atualizar(walker);
   }
   
   @GetMapping("/{id}")
   public Walker getPorId(@PathVariable Long id) {
        return this.walkerServico.getWalkerPorId(id);
   }
   
   
}

