package com.algaworks.transacao.teste;

import com.algaworks.transacao.caixa.Compra;
import com.algaworks.transacao.caixa.Finalizacao;
import com.algaworks.transacao.impressao.Impressora;
import com.algaworks.transacao.impressao.impressoras.Hp;
import com.algaworks.transacao.pagamento.Cartao;
import com.algaworks.transacao.pagamento.Operadora;
import com.algaworks.transacao.pagamento.operadoras.Stone;

public class TesteFinalizacao {

	public static void main(String[] args) {
		
		Operadora operadora = new Stone();
		Impressora impressora = new Hp();
		
		Cartao meuNubank = new Cartao();
		meuNubank.setNomeTitular("jorgin da silva");
		meuNubank.setNumeroCartao("123 000");
		
		Cartao meuInter = new Cartao();
		meuInter.setNomeTitular("JORGIN DA SILVA");
		meuInter.setNumeroCartao("123 456 789");

		Compra apoio = new Compra();
		apoio.setNomeCliente(meuInter.getNomeTitular());
		apoio.setProduto("Carrinho de supermercado");
		apoio.setValorTotal(158d);
		
		Finalizacao finalizacao = new Finalizacao(operadora, impressora);
		finalizacao.fecharCompra(apoio, meuNubank);
		finalizacao.fecharCompra(apoio, meuInter);

	}

}
