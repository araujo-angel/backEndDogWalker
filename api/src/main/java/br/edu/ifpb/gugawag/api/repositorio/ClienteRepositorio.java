package br.edu.ifpb.gugawag.api.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifpb.gugawag.api.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

    public Cliente findByCpf(String cpf);

    public java.util.Optional<Cliente> findById(Long id);

    public Cliente findByNome(String nome);

    public Cliente findByEndereco(String endereco);

}
