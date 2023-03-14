package one.digitalinnovation.projetospringdio.serviceescola.impl;

import one.digitalinnovation.projetospringdio.modelescola.Dados;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Dados consultarCep(@PathVariable("cep") String cep);
}
