package com.example.ZupSimula.dto;

import com.example.ZupSimula.enums.Risco;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class SimulacaoDTO {
    @Email(message = "Email inválido")
    private String email;
    private String nome;
    @CPF(message = "CPF inválido")
    private String cpf;
    private double valorInvestimento;
    @Min(value = 2,message = "Periodo minimo de aplicação é de 2 meses ")
    private int periodoDeAplicacao;
    private Risco risco;

    public SimulacaoDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public int getPeriodoDeAplicacao() {
        return periodoDeAplicacao;
    }

    public void setPeriodoDeAplicacao(int periodoDeAplicacao) {
        this.periodoDeAplicacao = periodoDeAplicacao;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}
