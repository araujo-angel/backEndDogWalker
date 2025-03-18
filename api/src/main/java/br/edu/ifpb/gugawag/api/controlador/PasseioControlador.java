package br.edu.ifpb.gugawag.api.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ifpb.gugawag.api.modelo.Passeio;
import br.edu.ifpb.gugawag.api.servico.PasseioServico;

import java.util.List;

@RestController
@RequestMapping("/passeios")
public class PasseioControlador {
    
    @Autowired
    private PasseioServico passeioServico;
    
    @GetMapping
    public List<Passeio> listar() {
        return this.passeioServico.getPasseios();
    }
    
    @PostMapping
    public Passeio inserir(@RequestBody Passeio passeio) {
        return this.passeioServico.inserir(passeio);
    }
    
    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Long id) {
        this.passeioServico.remover(id);
    }
    
   @PutMapping("/{id}")
   public Passeio atualizar(@RequestBody Passeio passeio) {
        return this.passeioServico.atualizar(passeio);
   }
   
   @GetMapping("/{id}")
   public Passeio getPorId(@PathVariable Long id) {
        return this.passeioServico.getPasseioPorId(id);
   }
   
   
}