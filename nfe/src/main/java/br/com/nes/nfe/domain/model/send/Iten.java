package br.com.nes.nfe.domain.model.send;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Iten {

    @JsonProperty("numero_item")
    private String numeroItem;
    @JsonProperty("codigo_produto")
    private String codigoProduto;
    @JsonProperty("codigo_barras_comercial")
    private String codigoBarrasComercial;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("codigo_ncm")
    private String codigoNcm;
    @JsonProperty("cfop")
    private String cfop;
    @JsonProperty("unidade_comercial")
    private String unidadeComercial;
    @JsonProperty("quantidade_comercial")
    private String quantidadeComercial;
    @JsonProperty("valor_unitario_comercial")
    private String valorUnitarioComercial;
    @JsonProperty("valor_bruto")
    private String valorBruto;
    @JsonProperty("codigo_barras_tributavel")
    private String codigoBarrasTributavel;
    @JsonProperty("unidade_tributavel")
    private String unidadeTributavel;
    @JsonProperty("quantidade_tributavel")
    private String quantidadeTributavel;
    @JsonProperty("valor_unitario_tributavel")
    private String valorUnitarioTributavel;
    @JsonProperty("inclui_no_total")
    private String inclui_no_total;
    @JsonProperty("icms_percentual_partilha")
    private String icmsPercentualPartilha;
    @JsonProperty("icms_origem")
    private String icmsOrigem;
    @JsonProperty("icms_situacao_tributaria")
    private String icmsSituacaoTributaria;
    @JsonProperty("pis_situacao_tributaria")
    private String pisSituacaoTributaria;
    @JsonProperty("pis_base_calculo")
    private String pisBaseCalculo;
    @JsonProperty("pis_aliquota_porcentual")
    private String pisAliquotaPorcentual;
    @JsonProperty("pis_valor")
    private String pisValor;
    @JsonProperty("cofins_situacao_tributaria")
    private String cofinsSituacaoTributaria;
    @JsonProperty("cofins_base_calculo")
    private String cofinsBaseCalculo;
    @JsonProperty("cofins_aliquota_porcentual")
    private String cofinsAliquotaPorcentual;
    @JsonProperty("cofins_valor")
    private String cofinsValor;
}
