package com.example.ZupSimula.simulacao;

import com.example.ZupSimula.dto.SimulacaoDTO;
import com.example.ZupSimula.dto.SimulacaoSaidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping ("/simulacao")
public class SimulacaoController {
    @Autowired
    private SimulacaoService simulacaoService;

    @PutMapping
    public SimulacaoSaidaDTO simulacaoInvestimento (@RequestBody @Valid  SimulacaoDTO simulacaoDTO){
        return simulacaoService.realizarSimulacao(simulacaoDTO);
    }
}
