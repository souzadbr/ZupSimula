package com.example.ZupSimula.simulacao;

import com.example.ZupSimula.dto.SimulacaoDTO;
import com.example.ZupSimula.dto.SimulacaoSaidaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping ("/simulacao")
@Api(value = "Gerenciador de Contas")
@CrossOrigin (origins = "*")
public class SimulacaoController {
    @Autowired
    private SimulacaoService simulacaoService;

    @PutMapping
    @ApiOperation(value = "Método que simula o investimento.")
    public SimulacaoSaidaDTO simulacaoInvestimento (@RequestBody @Valid  SimulacaoDTO simulacaoDTO){
        return simulacaoService.realizarSimulacao(simulacaoDTO);
    }
}
