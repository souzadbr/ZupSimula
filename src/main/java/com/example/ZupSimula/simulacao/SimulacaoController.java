package com.example.ZupSimula.simulacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/simulacao")
public class SimulacaoController {
    @Autowired
    private SimulacaoService simulacaoService;


}
