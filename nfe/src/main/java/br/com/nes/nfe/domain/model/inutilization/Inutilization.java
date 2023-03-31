package br.com.nes.nfe.domain.model.inutilization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inutilization {
    @JsonProperty("cnpj")
    String cnpj;
    @JsonProperty("serie")
    String serie;
    @JsonProperty("numero_inicial")
    String numero_inicial;
    @JsonProperty("numero_final")
    String numero_final;
    @JsonProperty("justificativa")
    String justificativa;
}
