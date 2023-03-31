package br.com.nes.nfe.domain.model.send;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class NFe {
    @JsonProperty("natureza_operacao")
    private String naturezaOperacao;
    @JsonProperty("data_emissao")
    private LocalDateTime dataEmissao;
    @JsonProperty("tipo_documento")
    private String tipoDocumento;
    @JsonProperty("local_destino")
    private String localDestino;
    @JsonProperty("finalidade_emissao")
    private String finalidadeEmissao;
    @JsonProperty("consumidor_final")
    private String consumidorFinal;
    @JsonProperty("presenca_comprador")
    private String presencaComprador;
    @JsonProperty("indicador_intermediario")
    private String indicadorIntermediario;
    @JsonProperty("cnpj_emitente")
    private String cnpjEmitente;
    @JsonProperty("nome_emitente")
    private String nomeEmitente;
    @JsonProperty("nome_fantasia_emitente")
    private String nomeFantasiaEmitente;
    @JsonProperty("logradouro_emitente")
    private String logradouroEmitente;
    @JsonProperty("numero_emitente")
    private String numeroEmitente;
    @JsonProperty("complemento_emitente")
    private String complementoEmitente;
    @JsonProperty("bairro_emitente")
    private String bairroEmitente;
    @JsonProperty("municipio_emitente")
    private String municipioEmitente;
    @JsonProperty("uf_emitente")
    private String ufEmitente;
    @JsonProperty("cep_emitente")
    private String cepEmitente;
    @JsonProperty("telefone_emitente")
    private String telefoneEmitente;
    @JsonProperty("inscricao_estadual_emitente")
    private String inscricaoEstadualEmitente;
    @JsonProperty("regime_tributario_emitente")
    private String regimeTributarioEmitente;
    @JsonProperty("cpf_destinatario")
    private String cpfDestinatario;
    @JsonProperty("nome_destinatario")
    private String nomeDestinatario;
    @JsonProperty("logradouro_destinatario")
    private String logradouroDestinatario;
    @JsonProperty("numero_destinatario")
    private String numeroDestinatario;
    @JsonProperty("bairro_destinatario")
    private String bairroDestinatario;
    @JsonProperty("municipio_destinatario")
    private String municipioDestinatario;
    @JsonProperty("uf_destinatario")
    private String ufDestinatario;
    @JsonProperty("cep_destinatario")
    private String cepDestinatario;
    @JsonProperty("telefone_destinatario")
    private String telefoneDestinatario;
    @JsonProperty("indicador_inscricao_estadual_destinatario")
    private String indicadorInscricaoEstadualDestinatario;
    @JsonProperty("numero_fatura")
    private String numeroFatura;
    @JsonProperty("valor_original_fatura")
    private int valorOriginalFatura;
    @JsonProperty("valor_desconto_fatura")
    private int valorDescontoFatura;
    @JsonProperty("valor_liquido_fatura")
    private int valorLiquidoFatura;
    @JsonProperty("duplicatas")
    private List<Duplicata> duplicatas;
    @JsonProperty("itens")
    private List<Iten> itens;
    @JsonProperty("icms_base_calculo")
    private String icmsBaseCalculo;
    @JsonProperty("icms_valor_total")
    private String icmsValorTotal;
    @JsonProperty("icms_valor_total_desonerado")
    private String icmsValorTotalDesonerado;
    @JsonProperty("fcp_valor_total")
    private String fcpValorTotal;
    @JsonProperty("icms_base_calculo_st")
    private String icmsBaseCalculoSt;
    @JsonProperty("icms_valor_total_st")
    private String icmsValorTotalSt;
    @JsonProperty("fcp_valor_total_st")
    private String fcpValorTotalSt;
    @JsonProperty("fcp_valor_total_retido_st")
    private String fcpValorTotalRetidoSt;
    @JsonProperty("valor_produtos")
    private String valorVrodutos;
    @JsonProperty("valor_frete")
    private String valorFrete;
    @JsonProperty("valor_seguro")
    private String valorSeguro;
    @JsonProperty("valor_desconto")
    private String valorDesconto;
    @JsonProperty("valor_total_ii")
    private String valorTotalIi;
    @JsonProperty("valor_ipi")
    private String valorIpi;
    @JsonProperty("valorIpiDevolvido")
    private String valor_ipi_devolvido;
    @JsonProperty("valor_pis")
    private String valorPis;
    @JsonProperty("valor_cofins")
    private String valorCofins;
    @JsonProperty("valor_outras_despesas")
    private String valorOutrasDespesas;
    @JsonProperty("valor_total")
    private String valorTotal;
    @JsonProperty("modalidadeFrete")
    private String modalidadeFrete;
    @JsonProperty("formas_pagamento")
    private List<FormasPagamento> formasPagamento;
    @JsonProperty("informacoes_adicionais_contribuinte")
    private String informacoesAdicionaisContribuinte;
    @JsonProperty("cnpj_responsavel_tecnico")
    private String cnpjResponsavelTecnico;
    @JsonProperty("contato_responsavel_tecnico")
    private String contatoResponsavelTecnico;
    @JsonProperty("email_responsavel_tecnico")
    private String emailResponsavelTecnico;
    @JsonProperty("telefone_responsavel_tecnico")
    private String telefoneResponsavelTecnico;
}
