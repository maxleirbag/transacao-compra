package com.algaworks.transacao.pagamento.operadoras;

import com.algaworks.transacao.pagamento.Autorizavel;
import com.algaworks.transacao.pagamento.Cartao;
import com.algaworks.transacao.pagamento.Operadora;

public class Stone implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		return cartao.getNomeTitular().toUpperCase().equals(cartao.getNomeTitular())
				&& autorizavel.getValorTotal() < 200;
	}
}
