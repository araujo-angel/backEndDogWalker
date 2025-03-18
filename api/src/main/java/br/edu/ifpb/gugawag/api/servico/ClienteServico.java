package br.edu.ifpb.gugawag.api.servico;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.gugawag.api.modelo.Cliente;
import br.edu.ifpb.gugawag.api.repositorio.ClienteRepositorio;

@Service
public class ClienteServico {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> getClientes(){
        return this.clienteRepositorio.findAll();
    }

    public Cliente getClientePorId(Long idCliente){
        return this.clienteRepositorio.findById(idCliente).orElse(null);
    }

    public Cliente inserir(Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }
    
    public Cliente atualizar(Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }
    
    public void remover(Long id) {
        this.clienteRepositorio.deleteById(id);
    }
}
