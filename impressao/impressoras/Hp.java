package com.algaworks.transacao.impressao.impressoras;

import com.algaworks.transacao.impressao.Impressora;
import com.algaworks.transacao.impressao.Imprimivel;

public class Hp implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("******************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("------------------");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("__________________");
		System.out.println("        HP        ");

	}

}
