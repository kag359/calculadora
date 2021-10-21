package com.example.calculadora;

import com.example.calculadora.Calculadora;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@RequestMapping("/")
public class CalculadoraController {
    private CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        super();
        this.calculadoraService = calculadoraService;
    }

    @RequestMapping(
            value = "/sum",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<String> soma (@RequestParam("a") double a, @RequestParam("b") double b){
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{\"result\": "+calculadoraService.getSoma(a, b)+ "}",httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/sub",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<String> sub (@RequestParam("a") double a, @RequestParam("b") double b){
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{\"result\": "+calculadoraService.getSubtracao(a, b)+ "}",httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/mult",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<String> mult (@RequestParam("a") double a, @RequestParam("b") double b){
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{\"result\": "+calculadoraService.getMultiplicacao(a, b)+ "}",httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/div",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<String> div (@RequestParam("a") double a, @RequestParam("b") double b){
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{\"result\": "+calculadoraService.getDivisao(a, b)+ "}",httpHeaders, HttpStatus.OK);
    }



}
