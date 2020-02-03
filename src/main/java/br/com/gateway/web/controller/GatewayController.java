package br.com.gateway.web.controller;

import br.com.gateway.service.GatewayService;
import br.com.gateway.web.dto.PessoaJuridicaResponse;
import br.com.gateway.web.dto.PessoaFisicaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Classe controller
 *
 * @author Luis Lucana (luislucana@gmail.com)
 *
 */
@RestController
@RequestMapping(value = "/gateway-api")
public class GatewayController {

    @Autowired
    private GatewayService gatewayService;

    @GetMapping(value="/ola", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> doSomething() {
        return (new ResponseEntity<>("funcionou!", HttpStatus.OK));
    }


    @GetMapping(value = "/pf/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    //public @ResponseBody XPTOResponse processSomething1(@RequestBody XPTORequest xptoRequest) {
    public @ResponseBody PessoaFisicaResponse consultarPessoaFisica(@PathVariable final long id) {
        PessoaFisicaResponse response = gatewayService.consultarServicoPessoaFisica(id);
        return response;
    }

    @GetMapping(value = "/pj/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody PessoaJuridicaResponse consultarPessoaJuridica(@PathVariable final long id) {
        PessoaJuridicaResponse response = gatewayService.consultarServicoPessoaJuridica(id);
        return response;
    }
}
