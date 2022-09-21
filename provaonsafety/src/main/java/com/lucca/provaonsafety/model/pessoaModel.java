package com.lucca.provaonsafety.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pessoa")
public class pessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column(unique = true, length = 15)
    private String cpf;
    @Column
    private LocalDate dataNascimento;
    private String email;

    
    public pessoaModel(){

    }

    public pessoaModel(Long id, String nome, String cpf, LocalDate dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    
}
