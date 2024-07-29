package com.designpatterns.subsistemaCep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){}

    public static CepApi getCepApi(){
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Curitiba";
    }

    public String recuperarEstado(String cep) {
        return "PR";
    }
}
