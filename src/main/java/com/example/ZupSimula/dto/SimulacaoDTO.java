package com.example.ZupSimula.Simulacao.dto;

import com.example.ZupSimula.Enum.Risco;

public class SimulacaoDTO {
    private String email;
    private String nome;
    private String cpf;
    private double valorInvestimento;
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
