package com.designpatterns.facade;

import com.designpatterns.subsistemaCep.CepApi;
import com.designpatterns.subsistemaCrm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getCepApi().recuperarCidade(cep);
        String estado = CepApi.getCepApi().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    
}
