package com.example.ZupSimula.simulacao;

import com.example.ZupSimula.dto.SimulacaoDTO;
import com.example.ZupSimula.dto.SimulacaoSaidaDTO;
import com.example.ZupSimula.enums.Risco;
import com.example.ZupSimula.exceptions.ValorBaixoRiscoAltoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulacaoService {
    private List<SimulacaoDTO> mailing = new ArrayList<>();

    public void adicionarSimulacaoNaLista (SimulacaoDTO simulacaoDTO){
        verificarValorERisco(simulacaoDTO);
        mailing.add(simulacaoDTO);
    }

    public SimulacaoSaidaDTO calcularSimulacao(SimulacaoDTO simulacaoDTO){
        double taxaDeRendimento = simulacaoDTO.getRisco().getTaxaDeRendimento();
        double valoAplicado = simulacaoDTO.getValorInvestimento();
        int periodoAplicado = simulacaoDTO.getPeriodoDeAplicacao();

        double valorDoLucro = 0;
        double valorTotal = 0;
        for (int i = 0;i<periodoAplicado; i++) {
            valorDoLucro = valorDoLucro + (valorTotal * taxaDeRendimento);
            valorTotal = valoAplicado + valorDoLucro;
        }
        return new SimulacaoSaidaDTO(valorTotal, valoAplicado, valorDoLucro);

    }

    public SimulacaoSaidaDTO realizarSimulacao(SimulacaoDTO simulacaoDTO){

        adicionarSimulacaoNaLista(simulacaoDTO);
        return calcularSimulacao(simulacaoDTO);
    }

    private void verificarValorERisco(SimulacaoDTO simulacaoDTO){
        if(simulacaoDTO.getRisco() == Risco.ALTO && simulacaoDTO.getValorInvestimento()< 5000){
            throw new ValorBaixoRiscoAltoException("Valor muito baixo para Risco alto");
        }
    }
}
