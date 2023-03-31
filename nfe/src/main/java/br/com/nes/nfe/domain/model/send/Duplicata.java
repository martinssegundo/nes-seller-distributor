package br.com.nes.nfe.domain.model.send;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Duplicata {
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("data_vencimento")
    private String dataVencimento;
    @JsonProperty("valor")
    private BigDecimal valor;
}
