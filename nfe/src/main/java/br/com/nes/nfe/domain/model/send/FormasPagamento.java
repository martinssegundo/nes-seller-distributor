package br.com.nes.nfe.domain.model.send;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormasPagamento {
    @JsonProperty("forma_pagamento")
    private String formaPagamento;
    @JsonProperty("valor_pagamento")
    private String valorPagamento;
    @JsonProperty("tipo_integracao")
    private Object tipoIntegracao;
}
