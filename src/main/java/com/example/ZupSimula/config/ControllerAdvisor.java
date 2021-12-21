package com.example.ZupSimula.config;

import com.example.ZupSimula.exceptions.ValorBaixoRiscoAltoException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<ErroDeValidacao> manipularErrosDeValidacao(MethodArgumentNotValidException exception) {
        List<ErroDeValidacao> erros = new ArrayList<>();
        for (FieldError fieldError : exception.getFieldErrors()) {
            ErroDeValidacao erroDeValidacao = new ErroDeValidacao(
                    fieldError.getDefaultMessage(), fieldError.getField());
            erros.add(erroDeValidacao);
        }
        return erros;
    }

    @ExceptionHandler(ValorBaixoRiscoAltoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public MensagemDeErro manipularExcecaoDeRiscoAltoValoBaixo(ValorBaixoRiscoAltoException exception){
        return new MensagemDeErro(exception.getMessage());
    }
}
