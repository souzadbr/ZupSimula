package com.example.ZupSimula.dto;

public class SimulacaoSaidaDTO {
    private double valorInvestido;
    private double valorTotaDoLucro;
    private double valorTotal;


    public SimulacaoSaidaDTO(double valorInvestido, double valorTotaDoLucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.valorTotaDoLucro = valorTotaDoLucro;
        this.valorTotal = valorTotal;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorTotaDoLucro() {
        return valorTotaDoLucro;
    }

    public void setValorTotaDoLucro(double valorTotaDoLucro) {
        this.valorTotaDoLucro = valorTotaDoLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
