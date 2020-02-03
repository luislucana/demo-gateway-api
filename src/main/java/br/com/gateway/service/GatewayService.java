package br.com.gateway.service;

import br.com.gateway.web.dto.PessoaFisicaResponse;
import br.com.gateway.web.dto.PessoaJuridicaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Consultar
 * https://www.baeldung.com/rest-template
 * https://www.baeldung.com/spring-rest-template-list
 * https://github.com/eugenp/tutorials/blob/a3881e1eafbc2bb4b31bee01b6431bcd17f018dc/spring-rest-simple/src/test/java/com/baeldung/web/test/RestTemplateBasicLiveTest.java
 */
@Service
public class GatewayService {

    private static final String URL_PF = "http://www.mocky.io/v2/5e3771283200007a00ae3dfb";
    private static final String URL_PJ = "http://www.mocky.io/v2/5e37732c3100005b00d37ac0";
    //private static final String URL_PJ_LOTE = "http://www.mocky.io/v2/5e377ee73100004b00d37acb";
    private static final String URL_PJ_LOTE = "http://www.mocky.io/v2/5e3780e93100004b00d37acd";

    public PessoaFisicaResponse consultarServicoPessoaFisica(final Long id) {
        final RestTemplate restTemplate = new RestTemplate();

        //final ResponseEntity<String> response = restTemplate.getForEntity(URL_PF + "/1", String.class);
        final ResponseEntity<PessoaFisicaResponse> response = restTemplate.getForEntity(URL_PF, PessoaFisicaResponse.class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("Status code inesperado.");
        }

        return response.getBody();
    }

    public PessoaJuridicaResponse consultarServicoPessoaJuridica(final Long id) {
        final RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<PessoaJuridicaResponse> response =
                restTemplate.getForEntity(URL_PJ, PessoaJuridicaResponse.class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("Status code inesperado.");
        }

        return response.getBody();
    }

    public List<PessoaJuridicaResponse> consultarServicoPessoaJuridicaEmLote() {
        final RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<PessoaJuridicaResponse[]> response =
                restTemplate.getForEntity(URL_PJ_LOTE, PessoaJuridicaResponse[].class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("Status code inesperado.");
        }

        return Arrays.asList(response.getBody());
    }
}
