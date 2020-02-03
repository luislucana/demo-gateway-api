package br.com.gateway.service;

import br.com.gateway.web.dto.XPTORequest;
import br.com.gateway.web.dto.XPTOResponse;
import org.springframework.stereotype.Service;

@Service
public class GatewayService {
    public XPTOResponse doSomething(XPTORequest request) {
        return new XPTOResponse();
    }
}
