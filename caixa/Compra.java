package com.algaworks.transacao.caixa;

//import java.time.OffsetDateTime;

import com.algaworks.transacao.impressao.Imprimivel;
import com.algaworks.transacao.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
	
	private double valorTotal;
	private String produto;
	private String nomeCliente;
//	private OffsetDateTime horarioCompra;

	@Override
	public String getCabecalhoPagina() {
		return this.getNomeCliente() + " | ";
	}
	@Override
	public String getCorpoPagina() {
		return this.getProduto()+" = R$"+this.getValorTotal();
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
