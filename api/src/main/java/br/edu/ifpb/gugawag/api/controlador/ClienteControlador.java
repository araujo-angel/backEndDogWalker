package br.edu.ifpb.gugawag.api.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ifpb.gugawag.api.modelo.Cliente;
import br.edu.ifpb.gugawag.api.servico.ClienteServico;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
    
    @Autowired
    private ClienteServico clienteServico;
    
    @GetMapping
    public List<Cliente> listar() {
        return this.clienteServico.getClientes();
    }
    
    @PostMapping
    public Cliente inserir(@RequestBody Cliente cliente) {
        return this.clienteServico.inserir(cliente);
    }
    
    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Long id) {
        this.clienteServico.remover(id);
    }
    
   @PutMapping("/{id}")
   public Cliente atualizar(@RequestBody Cliente aluno) {
        return this.clienteServico.atualizar(aluno);
   }
   
   @GetMapping("/{id}")
   public Cliente getPorId(@PathVariable Long id) {
        return this.clienteServico.getClientePorId(id);
   }
   
   
}
