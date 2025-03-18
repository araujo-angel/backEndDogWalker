package br.edu.ifpb.gugawag.api.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tabe_passeio")
public class Passeio{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String telefone;
    private String nomePet;
    private String dataHora;
    private String local;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "walker_id", nullable = false)
    private Walker walker;

    public Passeio() {

    }

    public Passeio(String telefone, String nomePet, String dataHora, String local){
        this.telefone = telefone;
        this.nomePet = nomePet;
        this.dataHora = dataHora;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setWalker(Walker walker) {
        this.walker = walker;
    }

    public Walker getWalker() {
        return walker;
    }
}