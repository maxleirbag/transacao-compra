package com.algaworks.transacao.caixa;

import com.algaworks.transacao.impressao.Impressora;
import com.algaworks.transacao.pagamento.Cartao;
import com.algaworks.transacao.pagamento.Operadora;

public class Finalizacao {

	private Operadora operadora;
	private Impressora impressora;

	public Finalizacao(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}

	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);

		if (autorizado) {
			this.impressora.imprimir(compra);
		}
		else {
			System.out.println("Compra não autorizada. \n");
		}
	}

}
