package br.com.gateway.web.controller;

import br.com.gateway.service.GatewayService;
import br.com.gateway.web.dto.XPTORequest;
import br.com.gateway.web.dto.XPTOResponse;
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


    @PostMapping(value = "/endpoint1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody XPTOResponse processSomething1(@RequestBody XPTORequest xptoRequest) {

        XPTOResponse response = gatewayService.doSomething(xptoRequest);

        return response;
    }

    @PostMapping(value = "/endpoint2", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody XPTOResponse processSomething2(@RequestBody XPTORequest xptoRequest) {

        XPTOResponse response = gatewayService.doSomething(xptoRequest);

        return response;
    }
}