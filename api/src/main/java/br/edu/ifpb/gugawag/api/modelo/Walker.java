package br.edu.ifpb.gugawag.api.modelo;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_walker")
public class Walker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String regiaoTrabalho;
    private Boolean ativo;

    @OneToMany(mappedBy = "walker", cascade = CascadeType.ALL)
    private List<Passeio> passeios;

    public Walker() {
    }

    public Walker(String nome, String email, String telefone, String endereco, String regiaoTrabalho, Boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.regiaoTrabalho = regiaoTrabalho;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRegiaoTrabalho() {
        return regiaoTrabalho;
    }

    public void setRegiaoTrabalho(String regiaoTrabalho) {
        this.regiaoTrabalho = regiaoTrabalho;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
