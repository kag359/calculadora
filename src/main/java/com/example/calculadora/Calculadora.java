package com.example.calculadora;

import org.springframework.stereotype.Service;

@Service
public class Calculadora implements CalculadoraService {

    public Calculadora() {
    }

    @Override
    public double getSoma(double a, double b){
        return a+b;
    }

    @Override
    public double getSubtracao(double a, double b){
        return a-b;
    }

    @Override
    public double getMultiplicacao(double a, double b){
        return a*b;
    }

    @Override
    public double getDivisao(double a, double b){
        return a/b;
    }

}
